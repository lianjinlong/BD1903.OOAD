package com.briup.bigdata.bd1903.ooad.proxy_model.static_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-22 09:21
 **/
public class StudentServiceImpl implements IStudentService{
    @Override
    public void insert(Student student){
        System.out.println("添加了学生："+student);
    }

    @Override
    public void delete(Student student){
        System.out.println("删除了学生："+student);
    }

    @Override
    public void update(Student student){
        System.out.println("更新了学生："+student);
    }

    @Override
    public Student select(String name){
        Student student=new Student(name,20);
        System.out.println("根据姓名："+name+" 查询到了学生："+student);
        return student;
    }
}
