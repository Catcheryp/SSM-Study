package com.yp.demo.service;

import com.yp.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// @Component(value = "userService") // 方法一： 默认值是类名称，首字母小写
@Service // 方法二
// @Controller
public class UserService {
    // 定义dao类型属性，不需要添加set方法
    @Autowired // 方法一： 根据类型注入
    // @Qualifier(value = "userDaoImplDemo01") // 方法二：根据名称进行注入
    // @Resource // 方法三：根据类型进行注入
    // @Resource(name = "userDaoImplDemo01") // 方法四：根据名称进行注入
    private UserDao userDao;

    @Value(value = "zzzzzzzz") // 注入普通类型属性
    private String name;

    public void add(){
        System.out.println("Service Add......" + name);
    }
}
