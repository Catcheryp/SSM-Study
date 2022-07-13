package com.yp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AopController {

    @RequestMapping("/testaop")
    @ResponseBody
    public String testAop(){
        System.out.println("test aop");
        return "test aop";
    }
}
