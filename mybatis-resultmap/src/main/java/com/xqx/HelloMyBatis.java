package com.xqx;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class HelloMyBatis {
	
	public static void main(String[] args){
		
		//声明配置文件
		String resource="Configure.xml";
		//加载应用配置文件
		InputStream is = HelloMyBatis.class.getClassLoader().getResourceAsStream(resource);
		//创建SqlSessionFactory 
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//获取Session
		SqlSession session = sessionFactory.openSession();
		
		try {
			//获取操作类
			UserOp userOp  = session.getMapper(UserOp.class);
			//完成操作
			User user =userOp.getUser(25);
            //查询
			System.out.println(user.getId()+":"+user.getUserName()+" ");
			System.out.println(user.getCourses().get(0).getCourseName()+" ");
			System.out.println(user.getCourses().get(0).getTeacher().getTeacherName());
            //修改
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭session
			session.close();
		}
	}

}
