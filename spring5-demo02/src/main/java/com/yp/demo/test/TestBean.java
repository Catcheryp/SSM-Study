package com.yp.demo.test;

import com.yp.demo.collectiontype.Book;
import com.yp.demo.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testCollection1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);

        student.test();
    }

    @Test
    public void testCollection2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);

        book.test();
    }

}
