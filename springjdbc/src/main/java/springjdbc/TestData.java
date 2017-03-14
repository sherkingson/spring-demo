package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
				JdbcTemplateDao dao = context.getBean("jdbcTemplateDao",JdbcTemplateDao.class);
			//	dao.createTable();
			//	dao.insertData();
				System.out.println(dao.count());
				((ConfigurableApplicationContext)context).close();
			

	}


	

}
