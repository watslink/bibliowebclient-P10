package com.sd.oc.webapp.controller;

import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.Reservation;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.User;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import com.sd.oc.serviceproxy.generated.bookServiceAPI.Book;
import com.sd.oc.serviceproxy.generated.bookServiceAPI.BookServiceAPI;
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
        listBorrowingOfBookOrderByDate = borrowingServiceAPI.findAllBorrowingOfBookOrderByReturnDate(bookId);

        model.addAttribute("isAlreadyPresent", isAlreadyPresent());
        model.addAttribute("isTooMuchReservation", isTooMuchReservation());
        model.addAttribute("nextReturnBorrowing", nextReturnBorrowing());

        return "reservation";
    }

    @GetMapping("/validateReservation")
    public String validateReservation(@RequestParam int bookId, @RequestParam int userId){
        reservationServiceAPI.addReservation(bookId, userId);
        return "redirect:/reservationOfUser";
    }

    @GetMapping("/reservationOfUser")
    public String reservationOfUser (Model model){
        User user = userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        List<Reservation>listReservationOfUser = reservationServiceAPI.findAllReservationOfUser(user.getUserId());
        model.addAttribute("listReservation", listReservationOfUser);

        return "reservationOfUser";
    }


    private boolean isAlreadyPresent(){
        if(listBorrowingOfUser!=null){
            for(Borrowing b: listBorrowingOfUser){
                if(b.getBook().getBookId() == book.getBookId()){
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
