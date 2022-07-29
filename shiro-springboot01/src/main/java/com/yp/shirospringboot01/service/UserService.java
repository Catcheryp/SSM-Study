package com.yp.shirospringboot01.service;

import com.yp.shirospringboot01.pojo.User;

public interface UserService {
    public User queryUserByName(String name);
}
