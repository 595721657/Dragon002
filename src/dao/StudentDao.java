package dao;
/**
 * ѧ���ӿ�
 * @author ����
 *
 */

import java.util.List;

import entity.Students;

public interface StudentDao {
        //��ѯ���е�ѧ����Ϣ
	    List<Students> getAll();
	    //�޸�ѧ����Ϣ�ķ���
	    int update(Students stu);
	    //����ѧ��ѧ�Ų�ѯ��Ϣ
	    Students findBysno(String sno);
	    //���ѧ����Ϣ�ķ���
	    int add(Students stu);
	    //ɾ��ѧУѧУ
	    int del(String sno);
}
