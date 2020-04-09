package com.zhongruan.web;

import com.zhongruan.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(StudentController.BASE_CONTROLLER)
public class StudentController {
//    字符串常量的提取
    public static final String BASE_CONTROLLER ="/studentController";
    public static final String INDEX_PAGE ="../index.jsp";

//    查询： 需要传递基本类型的ID
    @RequestMapping(value = "/getStudentById",method = RequestMethod.GET)
    public String getStudentById(Integer id,String str){
//        服务器处理
        System.out.println("模拟查询 。。。 查询编号为："+id+"字符串"+str);
//        给出页面响应
        return StudentController.INDEX_PAGE;
    }

//    模拟新增
//    传参：首先进行student 类对象的创建，在传递对象的属性名即可
    @RequestMapping("/addStu")
    public String addStu(Integer id,Student stu1){
//        服务器的处理
        System.out.println("ID为"+id);
        System.out.println("学生的信息为"+stu1.getId()+stu1.getStuName()+stu1.getAge());
//        页面响应， 没有报404错误
        return INDEX_PAGE;
    }
//    根据ids 进行多查询
//    小结： 数组传递的时候，先构建数组对象在封装参数
//    小结： 一般进行集合参数封装时，是将集合定义到类中，才能识别到集合名称实现封装
    @RequestMapping("/getStuByIds")
    public String getStuByIds(Integer[] ids, Student stu1){
        if (ids!=null) {
            for (Integer id : ids) {
                System.out.println("id为：" + id);
            }
        }
        else {
            System.out.println("ids为空:"+ids);
        }
        System.out.println("得到的集合为："+stu1.getSubs());
        return INDEX_PAGE;
    }

//    测试与ServletAPI的成员集成使用
    @RequestMapping("/servlet_API")
    public String getServletAPI(HttpServletRequest request,
                                HttpServletResponse response, HttpSession session){

    //        String parameter = request.getParameter();
//        只能到String类型

        System.out.println("请求对象为："+request);
        System.out.println("session对象为："+request.getSession());
        System.out.println("响应对象为："+response);
        System.out.println("其他对象为:"+session);
        return INDEX_PAGE;
    }
}
