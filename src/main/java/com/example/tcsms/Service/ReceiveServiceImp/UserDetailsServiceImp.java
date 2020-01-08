package com.example.tcsms.Service.ReceiveServiceImp;


import com.example.tcsms.Dao.UserDao;
import com.example.tcsms.Entity.JwtUser;
import com.example.tcsms.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by echisan on 2018/6/23
 */
@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.findByUsername(s);
        return new JwtUser(user);
    }

}
