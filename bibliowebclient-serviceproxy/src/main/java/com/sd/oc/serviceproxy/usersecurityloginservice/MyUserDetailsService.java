package com.sd.oc.serviceproxy.usersecurityloginservice;


import com.sd.oc.serviceproxy.generated.UserServiceAPI.User;
import com.sd.oc.serviceproxy.generated.UserServiceAPI.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    UserServiceAPI userServiceAPI;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userServiceAPI.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new MyUserDetails(user);
    }
}
