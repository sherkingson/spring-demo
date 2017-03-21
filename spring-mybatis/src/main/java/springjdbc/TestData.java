package springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
				
				MybatisDao dao=context.getBean("mybatisDao",MybatisDao.class);
                List<User>userList= dao.getUserList();		
				for(User user:userList){
					System.out.println(user.getFirst_name()+" "+user.getLast_name());
				}
				((ConfigurableApplicationContext)context).close();
			

	}


	

}
