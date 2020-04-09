package com.zhongruan.bean;

import java.util.List;

public class Student {
    private Integer id;
    private String stuName;
    private String age;
    private List<String> subs;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getSubs() {
        return subs;
    }

    public void setSubs(List<String> subs) {
        this.subs = subs;
    }

    public Student(Integer id, String stuName, String age) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
    }

    public Student() {
    }
}
