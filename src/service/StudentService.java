package service;

import java.util.List;

import entity.Students;

public interface StudentService {
	 //��ѯ���е�ѧ����Ϣ
    List<Students> getAll();
    //�޸�ѧ����Ϣ�ķ���
    int update(Students stu);
    //����ѧ��ѧ�Ų�ѯ��Ϣ
    Students findBysno(String sno);
    //���ѧ����Ϣ�ķ���
    int add(Students stu);
    //ɾ��ѧ����Ϣ�ķ���
    int del(String sno);
}
