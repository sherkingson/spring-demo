package mybatis;

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
		SqlSession session = sessionFactory.openSession(true);
		
		try {
			//获取操作类
			GetUserInfo getUserInfo = session.getMapper(GetUserInfo.class);
			//完成操作
			//增加
			User user = new User("chunfen", "nuaa");
			getUserInfo.addUser(user);
            //查询
			System.out.println(user.getId()+":"+user.getname()+","+user.getSchool());
            //修改
			user.setname("zhangsan");
			getUserInfo.updateUser(user);
			System.out.println(user.getId()+":"+user.getname()+","+user.getSchool());
			//删除
		//	getUserInfo.deleteUser(user.getId());
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭session
			session.close();
		}
	}

}
