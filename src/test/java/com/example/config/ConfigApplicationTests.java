package com.example.config;

import com.example.config.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
Spring Boot 单元测试
测试容器自动注入的功能
 */
// 使用 Spring Boot 单元测试，而非 JUnit 单元测试
@RunWith(SpringRunner.class)
// Spring boot 单元测试
@SpringBootTest
public class ConfigApplicationTests {
    // 自动注入注解
    @Autowired
    private User user;

    @Test
    public void contextLoads() {
        System.out.println(user);
    }

}
