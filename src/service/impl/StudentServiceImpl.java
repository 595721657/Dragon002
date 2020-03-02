package service.impl;

import java.util.List;

import dao.impl.StudentDaoImpl;
import entity.Students;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
	//����һ��dao�����
	StudentDaoImpl sdao=new StudentDaoImpl();
	//��ѯ���е�ѧ����Ϣ
	@Override
	public List<Students> getAll() {
		return sdao.getAll();
	}
	//�޸�ѧ����Ϣ�ķ���
	@Override
	public int update(Students stu) {
		return sdao.update(stu);
	}
	//���ѧ����Ϣ�ķ���
	@Override
	public int add(Students stu) {
		return sdao.add(stu);
	}
	//ɾ��ѧ����Ϣ�ķ���
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
