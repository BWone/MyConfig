package com.example.config.config;

import com.example.config.service.impl.MyserviceImpl;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration//写了@Configuration注解后,标注的类就是SpringBoot的配置类
public class MyConfig {

    //返回值类型是spring配置文件bean中的class属性
    //方法名是spring配置文件bean中的id属性
    @Bean
    public MyserviceImpl myserviceimpl(){
        System.out.println("通过@Bean注解创建实例对象");
        return new MyserviceImpl();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        /*
        Spring Framework有两个类加载YAML文件，YamlPropertiesFactoryBean和YamlMapFactoryBean
        通过PropertySourcePlaceholderConfigurer来加载yml文件，加载yml文件到容器中
         */
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
//        yaml.setResources(new FileSystemResource("c:/user.yml")); // ospath 引入
        yaml.setResources(new ClassPathResource("user.yml"));//classpath 引入
        configurer.setProperties(yaml.getObject());
        return configurer;
    }
}
