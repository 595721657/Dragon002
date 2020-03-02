package service.impl;

import java.util.List;

import dao.impl.StudentDaoImpl;
import entity.Students;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
	//创建一个dao层对象
	StudentDaoImpl sdao=new StudentDaoImpl();
	//查询所有的学生信息
	@Override
	public List<Students> getAll() {
		return sdao.getAll();
	}
	//修改学生信息的方法
	@Override
	public int update(Students stu) {
		return sdao.update(stu);
	}
	//添加学生信息的方法
	@Override
	public int add(Students stu) {
		return sdao.add(stu);
	}
	//删除学生信息的方法
	@Override
	public int del(String sno) {
		return sdao.del(sno);
	}
	@Override
	public Students findBysno(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

}
