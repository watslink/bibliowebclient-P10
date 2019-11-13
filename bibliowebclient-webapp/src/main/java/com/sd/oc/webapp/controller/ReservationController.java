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
    public String extendBorrowing(@RequestParam int bookId, Model model){
        listReservation = reservationServiceAPI.findAllReservationOfBookOrderByDate(bookId);
        book = bookServiceAPI.findBookById(bookId);
        model.addAttribute("book", book );
        User user = userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        listBorrowingOfUser = borrowingServiceAPI.findAllBorrowingOfUser(user.getUserId());
        listBorrowingOfBookOrderByDate = borrowingServiceAPI.findAllBorrowingOfBookOrderByReturnDate(bookId);

        model.addAttribute("isAlreadyPresent", isAlreadyPresent());
        model.addAttribute("isTooMuchReservation", isTooMuchReservation());
        model.addAttribute("nextReturnBorrowing", nextReturnBorrowing());

        return "reservation";
    }

    private boolean isAlreadyPresent(){
        for(Borrowing b: listBorrowingOfUser){
            if(b.getBook().getBookId() == book.getBookId()){
                return true;
            }
        }
        return false;
    }

    private boolean isTooMuchReservation(){
        if(listReservation.size() < (book.getNbTotalExemplaire()*2)){
            return false;
        }
       else{
           return true;
        }
    }

    private Borrowing nextReturnBorrowing(){
       return listBorrowingOfBookOrderByDate.get(listBorrowingOfBookOrderByDate.size()-1);
    }
}
