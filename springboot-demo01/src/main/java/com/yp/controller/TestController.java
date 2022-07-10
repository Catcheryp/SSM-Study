package com.yp.controller;

import com.yp.mapper.UserMapper;
import com.yp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Catcher
 */

@Controller
// @SessionAttributes(names = {"user1"}, types = {User.class, Integer.class})
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @ModelAttribute(value = "param1")
    public String myModel1(@RequestParam(required = false) String param1){
        return param1;
    }

    @ModelAttribute
    public void myModel2(Model model){
        model.addAttribute("name", "yp");
        model.addAttribute("age", 25);
    }

    @RequestMapping("/test5")
    @ResponseBody
    public String test5(@ModelAttribute("param1") String p1, @ModelAttribute("name") String p2, @ModelAttribute("age") int p3){
        System.out.println("----------- test5 -------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        return "test5";
    }

    /*// @ModelAttribute注解测试2
    @RequestMapping("/test4")
    @ResponseBody
    public String test4(@RequestParam(required = false) String param1, Model model){
        System.out.println("----------- test4 ------------");
        model.addAttribute("param1", param1);
        System.out.println(model.getAttribute("param1"));
        return "test4";
    }*/

    /*// @ModelAttribute注解测试1
    @RequestMapping("/test3")
    @ResponseBody
    public String test3(){
        System.out.println("----------- test3 ------------");
        return "test3";
    }

    @ModelAttribute
    public void myModel(@RequestParam(required = false) String param1, Model model){
        System.out.println("----------- myModel -----------");
        model.addAttribute("param1", param1);
        System.out.println(model.getAttribute("param1"));
    }*/


    /*// Mybatis测试
    @GetMapping("/test")
    public List<User> hello(){
        List<User>	users = userMapper.selectUserList();
        return	users;
    }*/

    /*// @SessionAttributes注解测试
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(Model model, HttpSession httpSession){
        User user = new User(3, "zhangsan", 18, "男");
        // model.addAttribute(user);
        model.addAttribute("user1", user);
        model.addAttribute("age", 99);

        System.out.println("------------ test1 -------------");
        System.out.println(httpSession.getAttribute("user1"));
        System.out.println(httpSession.getAttribute("age"));
        return "test1";
    }*/

    /*// @SessionAttribute注解测试
    @RequestMapping("/test2")
    @ResponseBody
    public String test2(@SessionAttribute("user1") User user){
        System.out.println("-------------- test2 ------------");
        System.out.println(user.getName());
        return "test2";
    }*/


    /*// ModelAndView结合freemarker的使用
    @RequestMapping("/test2")
    public ModelAndView test2(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello yp , this is freemarker");

        ModelAndView mv = new ModelAndView();
        User user = new User(3, "zhangsan", 18, "男");
        mv.addObject("user1", user);
        mv.setViewName("freemarker");
        return mv;
    }*/

    /*// freemarker的简单使用
    @RequestMapping("/fm")
    public String testFreemarker(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello yp , this is freemarker");
        return "freemarker";
    }*/

    /*// thymeleaf的简单使用
    @RequestMapping("/th")
    public String testThymeleaf(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello yp, this is thymeleaf.");
        return "thymeleaf";
    }*/
}
