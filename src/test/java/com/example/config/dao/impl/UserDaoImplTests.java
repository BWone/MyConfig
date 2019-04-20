package com.example.config.dao.impl;

import com.example.config.service.impl.MyserviceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoImplTests {

    @Autowired
    private UserDaoImpl userDao;

    @Autowired
    private MyserviceImpl myservice;

    @Test
    public void getUserDetails(){
        System.out.println(myservice);
        userDao.getUserDetails();
    }
}
