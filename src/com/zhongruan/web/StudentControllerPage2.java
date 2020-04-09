package com.zhongruan.web;

import com.zhongruan.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(StudentControllerPage2.BASE_CONTROLLER)
public class StudentControllerPage2 {
//    字符串常量的提取
    public static final String BASE_CONTROLLER ="/studentControllerPage2";
    public static final String INDEX_PAGE ="../index.jsp";

    @RequestMapping("/getData")
    public String getData(HttpServletRequest request, HttpServletResponse response,
                          Model m, ModelMap mm,
                          @ModelAttribute("stu1")Student stu1,
                          @ModelAttribute("sex")Integer sex){

//        1、直接借用ServeletAPI实现模拟数据响应
//        request.setAttribute("name1","小明");
//        request.getSession().setAttribute("name2","小明2");
//        return "../index.jsp";

//        2、借用ModelAndView对象实现数据响应
//        ModelAndView mv  = new ModelAndView();
//        Student s1 = new Student(1,"小明","");
//        mv.addObject("s1",s1);
//        mv.setViewName("../index.jsp");
//        return mv;

//        3、借用Model 和 ModelMap 实现响应： 可以理解为从ModelAndView 拆分过来的
//            m.addAttribute("name3","笑花");
//            mm.addAttribute("name4","我的错");
//            mm.put("name5","下班了");
//            return INDEX_PAGE;

//        4、可以借用注解，@ModelAttribute实现响应
//        方法形参的响应方式： 引用类型可以被覆盖，基本类型的不可以，只能响应原本的函数
        stu1.setId(2);
        stu1.setStuName("Stu");
        sex =18;
        return INDEX_PAGE;
    }
//    5、数据响应：通过返回值直接响应到客户端，无需响应视图
//    406：（Not Acceptable）：服务端错误，表示去响应数据的时候，格式无法正常转换
    @RequestMapping("/getData2")
    @ResponseBody
    public String getData2(){
//        如果是针对客户端的ajax请求，需要与数据响应，需要导包
//        1、直接响应字符串,传中文乱码
//        return "阿斯达";

//        2、直接响应引用对象
//        Student student = new Student();
//        student.setId(1);
//        student.setStuName("asd");
//        return student;

//        3、直接响应集合
//        Student s1 = new Student(1,"asd","12");
//        Student s2 = new Student(2,"as","11");
//        Student s3 = new Student(3,"a","10");
//        List list = new ArrayList();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        return list;

//        3、直接响应JSON字符串
        String strJson ="{\"id\":2,\"stuName\":\"隔壁老沈\",\"age\":\"20\"}";
        return strJson;
    }
}
