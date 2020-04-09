package com.zhongruan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(LoginController.BASE_CONTROLLER)
public class LoginController {

//      优化：字符串常量的提取
    public static final String BASE_CONTROLLER ="/loginController";
    public static final String INDEX_PAGE = "../index.jsp";
    //    模拟登录
    @RequestMapping(value = {"/login"})
    public String login(){

//      1、服务器的处理
        System.out.println("正在登录。。。登录成功");
//      2、页面的响应
        return LoginController.INDEX_PAGE;
    }
}
