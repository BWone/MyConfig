package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//application.properties全局配置文件

//@ImportResource(locations = {"classpath:config/beans.xml"})//加载Spring的xml文件
@SpringBootApplication//说明该类是主程序类、主入口类、主配置类
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
