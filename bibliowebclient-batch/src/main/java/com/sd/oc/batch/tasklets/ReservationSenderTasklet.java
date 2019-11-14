package com.sd.oc.batch.tasklets;

import com.sd.oc.batch.EmailService.EmailService;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.Book;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.BookServiceAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ReservationSenderTasklet implements Tasklet {

    @Autowired
    ReservationServiceAPI reservationServiceAPI;

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    BookServiceAPI bookServiceAPI;

    @Autowired
    EmailService emailService;

    private String ls= System.lineSeparator();

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("Batch execute: Reservation Mail Alert");

        reservationServiceAPI.deleteAllReservationOutOfDate();

        List<Book> booklList = bookServiceAPI.findAllBooks();

        for (Book book: booklList){
            List<Reservation> reservationList = reservationServiceAPI.findAllReservationOfBookOrderByDate(book.getBookId());
            if(!reservationList.isEmpty() && book.getNbStock()>0){
                Reservation nextReservation = reservationList.get(0);
                if(nextReservation.getDateStartMailing() == null){
                    reservationServiceAPI.setStartDateMailingOfReservation(nextReservation.getReservationId());
                }
                nextReservation = reservationServiceAPI.findReservation(nextReservation.getReservationId());
                String to=nextReservation.getUser().getMail();
                String subject="Le Livre "+book.getTitle()+" est disponible";
                StringBuilder text= new StringBuilder("Bonjour " + nextReservation.getUser().getUsername() + "," + ls+ls
                        + "Le livre suivant est a nouveau disponible dans votre bibliothèque:" + ls);
                text.append(book.getTitle()).append(" (").append(book.getAuthor()).append(")").append(ls);
                text.append("Ce livre vous sera reservé 48h à partir du "+nextReservation.getDateStartMailing()+ls+ls);
                text.append(ls).append(ls).append("Cordialement,").append(ls).append("BiblioOC.");

                emailService.sendSimpleMessage(to, subject, text.toString());
            }
        }

        return RepeatStatus.FINISHED;
    }
}
