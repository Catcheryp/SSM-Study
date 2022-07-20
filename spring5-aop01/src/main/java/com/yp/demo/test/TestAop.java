package com.yp.demo.test;

import com.yp.demo.aopannotation.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
