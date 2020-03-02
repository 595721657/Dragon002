package dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * 
 */
import java.util.List;

import dao.StudentDao;
import entity.Students;
import utils.MyDButils;

public class StudentDaoImpl implements StudentDao {
    //查询所有的学生信息
	@Override
	public List<Students> getAll() {
		List<Students> stu=new ArrayList<Students>();
		try {
			String sql="SELECT * FROM student";
			Object params[]=null;
			ResultSet rs=MyDButils.queryAll(sql, params);
			while(rs.next()) {
				stu.add(new Students(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}
    //修改学生信息的方法
	@Override
	public int update(Students stu) {
       String sql="UPDATE student SET Sname=?,Sage=?,Ssex=?,Szhuanye=? WHERE Sid=?";
       Object[] params = {stu.getName(),stu.getAge(),stu.getSex(),stu.getSpecial(),stu.getSno()};
       return MyDButils.updateAll(sql, params);
	}
    //添加学生信息的方法
	@Override
	public int add(Students stu) {
		String sql="INSERT INTO student(Sid,Sname,Sage,Ssex,Szhuanye) VALUES(?,?,?,?,?)";
		Object params[]= {stu.getSno(),stu.getName(),stu.getAge(),stu.getSex(),stu.getSpecial()};
		return MyDButils.updateAll(sql, params);
	}
	//删除学生信息的方法
	@Override
	public int del(String sno) {
        String sql="delete from student where Sid=?";
		return MyDButils.updateAll(sql, sno);
	}
	//通过学号查询学生信息
	@Override
	public Students findBysno(String sno) {
		Students stu=null;
		try {
			String sql = "select * from student where Sid=?";
			ResultSet rs = MyDButils.queryAll(sql,sno);
			if (rs.next()) {
				stu = new Students(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stu;
	}

}
