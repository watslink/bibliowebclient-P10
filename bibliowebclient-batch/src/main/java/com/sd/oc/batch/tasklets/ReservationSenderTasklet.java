package com.sd.oc.batch.tasklets;

import com.sd.oc.batch.EmailService.EmailService;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.User;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationSenderTasklet implements Tasklet {

    @Autowired
    ReservationServiceAPI reservationServiceAPI;

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    EmailService emailService;

    private String ls= System.lineSeparator();

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("Batch execute: Reservation Mail Alert");


        List<Reservation> reservationList = reservationServiceAPI.findAllReservations();



        List<User> listUser=userServiceAPI.findAllUsers();
        for (User user:listUser) {
            List<Borrowing> borrowingsWhoNeedRecallList=borrowingServiceAPI.findAllBorrowingOutOfTimeOfUser(user.getUserId());
            if(borrowingsWhoNeedRecallList!=null){
                String to=user.getMail();
                String subject="Fin de prêt";
                StringBuilder text= new StringBuilder("Bonjour " + user.getUsername() + "," + ls+ls
                        + "Merci de venir rendre rapidement ce(s) livre(s) à la bibliothéque:" + ls);
                for(Borrowing borrowing: borrowingsWhoNeedRecallList){
                    text.append("- ").append(borrowing.getBook().getTitle()).append(" (").append(borrowing.getBook().getAuthor()).append(")").append(ls);
                }
                text.append(ls).append(ls).append("Cordialement,").append(ls).append("BiblioOC.");

                emailService.sendSimpleMessage(to, subject, text.toString());
            }
        }
        return RepeatStatus.FINISHED;
    }
}
