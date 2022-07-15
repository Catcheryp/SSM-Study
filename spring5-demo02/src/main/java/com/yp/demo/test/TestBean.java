package com.yp.demo.test;

import com.yp.demo.autowire.Employee;
import com.yp.demo.bean.Orders;
import com.yp.demo.collectiontype.Book;
import com.yp.demo.collectiontype.Course;
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
        // Book book = context.getBean("book", Book.class);
        //
        // book.test();

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);
    }

    @Test
    public void testBean3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("------创建bean实例对象------");
        System.out.println(orders);

        // 手动销毁bean实例
        context.close();
    }

    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}
