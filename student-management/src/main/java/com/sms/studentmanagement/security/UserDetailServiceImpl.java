package com.sms.studentmanagement.security;

import com.sms.studentmanagement.dao.UserRepository;
import com.sms.studentmanagement.entity.Users;
import com.sms.studentmanagement.security.MyUSerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.getUsersByUsername(username);
        if(user == null)
        {
            throw new UsernameNotFoundException(String.format("Username %s not found",username));
        }
        return new MyUSerDetails(user);
    }
}
