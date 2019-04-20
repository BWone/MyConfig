package com.example.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 只有这个类是容器中的组件（@Component）,才能使用Spring Boot容器提供的@ConfigurationProperties功能；
 * 将配置文件中相应节的属性值，注入到组件（本处是实体类）中
 * @ConfigurationProperties :实现类中属性和配置文件中相关配置属性的绑定注入
 * prefix="user":指明和配置文件中哪个节下面的所有属性进行一一映射，完成绑定注入
 */

@Component

//！！！！！
//@PropertySource属于互补配置，而且必须有一个另外的配置文件
//当两个配置文件中给同一属性赋值时，另外的配置文件覆盖互补配置文件
// 当另外的配置文件中属性有缺省时，@PropertySource起互补作用
//value等于一个数组，用{ ，}，value可以省略不写，数组内单个值时可以不写{}
@PropertySource(value = {"classpath:user.properties"})

//！！！！！
//@ConfigurationProperties默认去找application.yml或application.properties的文件
//@ConfigurationProperties(prefix = "server.user")//在yml文件中user为server的子节
@ConfigurationProperties(prefix = "user")//在properties的文件中通过注解关联,user调用属性
public class User {
    //通过Value属性直接赋值,配置文件设置的属性优先显示,配置文件没设置的属性Value起作用
    //@Value("张三丰")
    private  String usn;
    //@Value("#{2*9}")
    private Integer age;
    private boolean boss;
    //@Value("${server.user.birthday}")
    private Date birthday;
    private Map<String,Integer> maps;
    private List<String> lists;
    private Cat cat;

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Integer> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Integer> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "usn='" + usn + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", cat=" + cat +
                '}';
    }
}
