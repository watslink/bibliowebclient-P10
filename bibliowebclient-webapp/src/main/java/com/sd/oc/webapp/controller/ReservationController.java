package com.sd.oc.webapp.controller;

import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.User;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.Book;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.BookServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ReservationController {

    @Autowired
    ReservationServiceAPI reservationServiceAPI;

    @Autowired
    BookServiceAPI bookServiceAPI;

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    BorrowingServiceAPI borrowingServiceAPI;


    private Book book;
    private List<Reservation> listReservation;
    private List<Reservation> listReservationOfUser;
    private List<Borrowing> listBorrowingOfUser;
    private List<Borrowing> listBorrowingOfBookOrderByDate;

    @GetMapping("/reservation")
    public String reservation(@RequestParam int bookId, Model model){
        listReservation = reservationServiceAPI.findAllReservationOfBookOrderByDate(bookId);
        if(listReservation!=null){
            model.addAttribute("nbResa", listReservation.size());
        } else {
            model.addAttribute("nbResa", 0);
        }
        book = bookServiceAPI.findBookById(bookId);
        model.addAttribute("book", book );
        User user = userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("user", user);
        listBorrowingOfUser = borrowingServiceAPI.findAllBorrowingOfUser(user.getUserId());
        listReservationOfUser = reservationServiceAPI.findAllReservationOfUser(user.getUserId());
        listBorrowingOfBookOrderByDate = borrowingServiceAPI.findAllBorrowingOfBookOrderByReturnDate(bookId);

        model.addAttribute("isAlreadyPresentinBorrowing", isAlreadyPresentInBorrowing());
        model.addAttribute("isAlreadyPresentinReservation", isAlreadyPresentInReservation());
        model.addAttribute("isTooMuchReservation", isTooMuchReservation());
        model.addAttribute("nextReturnBorrowing", nextReturnBorrowing());

        return "reservation";
    }

    @GetMapping("/validateReservation")
    public String validateReservation(@RequestParam int bookId, @RequestParam int userId){
        reservationServiceAPI.addReservation(bookId, userId);
        return "redirect:/reservationOfUser";
    }

    @GetMapping("/deleteReservation")
    public String deleteReservation(@RequestParam int reservationId){
        reservationServiceAPI.deleteReservation(reservationId);
        return "redirect:/reservationOfUser";
    }

    @GetMapping("/reservationOfUser")
    public String reservationOfUser (Model model){
        User user = userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        List<Reservation>listReservationOfUser = reservationServiceAPI.findAllReservationOfUser(user.getUserId());
        model.addAttribute("listReservation", listReservationOfUser);

        return "reservationOfUser";
    }

    @GetMapping("/detailsReservation")
    public String detailsReservation (Model model, @RequestParam int reservationId){
        Reservation reservation = reservationServiceAPI.findReservation(reservationId);
        model.addAttribute("reservation", reservation);
        List<Borrowing> listBorrowing = borrowingServiceAPI.findAllBorrowingOfBookOrderByReturnDate(reservation.getBook().getBookId());
        model.addAttribute("nextReturnBorrowing", listBorrowing.get(0));
        List<Reservation> listResa = reservationServiceAPI.findAllReservationOfBookOrderByDate(reservation.getBook().getBookId());
        int position =-1;
        for(Reservation resa: listResa){
            if(resa.getReservationId() == reservationId){
                position = listResa.indexOf(resa)+1;
            }
        }
        model.addAttribute("position", position);

        return "detailsReservation";
    }

    private boolean isAlreadyPresentInBorrowing(){
        if(listBorrowingOfUser!=null){
            for(Borrowing b: listBorrowingOfUser){
                if(b.getBook().getBookId() == book.getBookId()){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAlreadyPresentInReservation(){
        if(listReservationOfUser!=null){
            for(Reservation r: listReservationOfUser){
                if(r.getBook().getBookId() == book.getBookId()){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTooMuchReservation(){
        if(listReservation!=null){
            if(listReservation.size() >= (book.getNbTotalExemplaire()*2)){
                return true;
            }
        }
           return false;
    }

    private Borrowing nextReturnBorrowing(){
        if(listBorrowingOfBookOrderByDate!=null) {
            return listBorrowingOfBookOrderByDate.get(0);
        }
        else {
            return null;
        }
    }
}
