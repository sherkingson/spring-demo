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
		SqlSession session = sessionFactory.openSession(true);
		
		try {
			//��ȡ������
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			//��ɲ���
			//����
			User user = new User("chunfen", "nuaa");
			getUserInfo.addUser(user);
            //��ѯ
			System.out.println(user.getId()+":"+user.getname()+","+user.getSchool());
            //�޸�
			user.setname("zhangsan");
			getUserInfo.updateUser(user);
			System.out.println(user.getId()+":"+user.getname()+","+user.getSchool());
			//ɾ��
		//	getUserInfo.deleteUser(user.getId());
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر�session
			session.close();
		}
	}

}
