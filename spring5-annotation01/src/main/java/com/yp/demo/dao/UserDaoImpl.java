package com.yp.demo.dao;


import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImplDemo01")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl add......");
    }
}
