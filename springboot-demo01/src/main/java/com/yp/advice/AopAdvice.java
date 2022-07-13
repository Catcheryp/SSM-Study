package com.yp.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdvice {

    /**
     * 1.这里是对com.yp.controller包下面所有类的所有方法进行增强
     * 2.对相同切入点进行抽取，后续只需要使用@Before("test()")即可
     */
    @Pointcut("execution (* com.yp.controller.*.*(..))")
    public void test() {
    }

    @Before("test()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice...");
    }

    @After("test()")
    public void afterAdvice() {
        System.out.println("afterAdvice...");
    }

    @Around("test()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.out.println("after");
    }

}
