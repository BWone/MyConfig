package com.example.config.dao.impl;

import com.example.config.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {

    @Autowired
    private User user;

    public void getUserDetails(){
        System.out.println(user);
    }
}
