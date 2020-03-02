package dao;
/**
 * 学生接口
 * @author 黄龙
 *
 */

import java.util.List;

import entity.Students;

public interface StudentDao {
        //查询所有的学生信息
	    List<Students> getAll();
	    //修改学生信息的方法
	    int update(Students stu);
	    //根据学生学号查询信息
	    Students findBysno(String sno);
	    //添加学生信息的方法
	    int add(Students stu);
	    //删除学校学校
	    int del(String sno);
}
