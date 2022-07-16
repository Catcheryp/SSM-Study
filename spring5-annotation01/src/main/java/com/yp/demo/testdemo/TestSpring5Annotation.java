package com.yp.demo.testdemo;

import com.yp.demo.config.SpringConfig;
import com.yp.demo.dao.UserDao;
import com.yp.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Annotation {

    @Test
    public void testAnnotation1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testAnnotation2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }
}
