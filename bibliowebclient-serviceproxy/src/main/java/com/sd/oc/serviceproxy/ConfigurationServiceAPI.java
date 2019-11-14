package com.sd.oc.serviceproxy;


import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingAPI;
import com.sd.oc.serviceproxy.generated.BorrowingServiceAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationAPI;
import com.sd.oc.serviceproxy.generated.ReservationServiceAPI.ReservationServiceAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserAPI;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.BookAPI;
import com.sd.oc.serviceproxy.generated.BookServiceAPI.BookServiceAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sd.oc.serviceproxy")
public class ConfigurationServiceAPI {

    @Bean
    public BookServiceAPI bookServiceAPI(){
        BookAPI bookAPI=new BookAPI();
        return bookAPI.getBookServiceAPIPort();
    }

    @Bean
    public UserServiceAPI userServiceAPI(){
        UserAPI userAPI=new UserAPI();
        return userAPI.getUserServiceAPIPort();
    }

    @Bean
    public BorrowingServiceAPI borrowingServiceAPI(){
        BorrowingAPI borrowingAPI=new BorrowingAPI();
        return borrowingAPI.getBorrowingServiceAPIPort();
    }

    @Bean
    public ReservationServiceAPI reservationServiceAPI(){
        ReservationAPI reservationAPI=new ReservationAPI();
        return reservationAPI.getReservationServiceAPIPort();
    }
}
