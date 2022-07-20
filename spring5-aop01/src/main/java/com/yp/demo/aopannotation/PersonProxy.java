package com.yp.demo.aopannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect
@Order(1)
public class PersonProxy {
    // 后置通知(返回通知)
    @Before(value = "execution(* com.yp.demo.aopannotation.User.add(..))")
    public void afterReturning(){
        System.out.println("PersonProxy afterReturning......");
    }
}
