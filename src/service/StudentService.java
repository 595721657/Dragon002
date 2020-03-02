package service;

import java.util.List;

import entity.Students;

public interface StudentService {
	 //查询所有的学生信息
    List<Students> getAll();
    //修改学生信息的方法
    int update(Students stu);
    //根据学生学号查询信息
    Students findBysno(String sno);
    //添加学生信息的方法
    int add(Students stu);
    //删除学生信息的方法
    int del(String sno);
}
