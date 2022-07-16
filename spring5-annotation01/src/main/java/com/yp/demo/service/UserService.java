package com.yp.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component(value = "userService") // 方法一： 默认值是类名称，首字母小写
@Service // 方法二
public class UserService {
    public void add(){
        System.out.println("Service Add......");
    }
}
