package com.yp.demo.jdkproxy;

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("UserDaoImpl中执行了add方法......");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("UserDaoImpl中执行了update方法......");
        return id;
    }
}
