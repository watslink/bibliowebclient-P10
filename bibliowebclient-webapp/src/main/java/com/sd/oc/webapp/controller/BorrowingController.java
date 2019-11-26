package com.sd.oc.webapp.controller;



import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.Borrowing;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.User;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BorrowingController {

    @Autowired
    UserServiceAPI userServiceAPI;

    @Autowired
    BorrowingServiceAPI borrowingServiceAPI;

    @GetMapping("/borrowings")
    public String getBorrowings(Model model){
        User user= userServiceAPI.findUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        List<Borrowing> borroOfUser = borrowingServiceAPI.findAllBorrowingOfUser(user.getUserId());
        List<Borrowing> borroOutOfDateOfUser = borrowingServiceAPI.findAllBorrowingOutOfTimeOfUser(user.getUserId());

        for(Borrowing borroOutOfDate: borroOutOfDateOfUser){
            for(int i = 0; i<borroOfUser.size(); i++){
                if(borroOfUser.get(i).getBorrowingId()==(borroOutOfDate.getBorrowingId())){
                    borroOfUser.remove(i);
                    i--;
                }
            }
        }

        model.addAttribute("listBorrowings", borroOfUser);
        model.addAttribute("listBorrowingsOutOfDate", borroOutOfDateOfUser);
        return "borrowings";
    }

    @GetMapping("/extend")
    public String extendBorrowing(@RequestParam int borrowingId){
        borrowingServiceAPI.extendBorrowing(borrowingId);
        return "redirect:/borrowings";
    }
}
