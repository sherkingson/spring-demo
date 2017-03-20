package com.xqx;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class HelloMyBatis {
	
	public static void main(String[] args){
		
		//���������ļ�
		String resource="Configure.xml";
		//����Ӧ�������ļ�
		InputStream is = HelloMyBatis.class.getClassLoader().getResourceAsStream(resource);
		//����SqlSessionFactory 
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//��ȡSession
		SqlSession session = sessionFactory.openSession();
		
		try {
			//��ȡ������
			UserOp userOp  = session.getMapper(UserOp.class);
			//��ɲ���
			User user =userOp.getUser(25);
            //��ѯ
			System.out.println(user.getId()+":"+user.getUserName()+" ");
			System.out.println(user.getCourses().get(0).getCourseName()+" ");
			System.out.println(user.getCourses().get(0).getTeacher().getTeacherName());
            //�޸�
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر�session
			session.close();
		}
	}

}
