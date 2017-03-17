package mybatis;

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
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			//��ɲ�ѯ����
			User user = getUserInfo.getUser(10);
			
			System.out.println(user.getId()+":"+user.getname()+","+user.getSchool());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر�session
			session.close();
		}
	}

}
