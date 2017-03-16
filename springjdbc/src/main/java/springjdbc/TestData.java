package springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
			//	JdbcTemplateDao dao = context.getBean("jdbcTemplateDao",JdbcTemplateDao.class);
			//	dao.createTable();
			//	dao.insertData();	
//			List<User> userList=dao.getUserList();
//				for(User user: userList){
//					System.out.println(user.getId()+":"+user.getLast_name()+" "+user.getFirst_name());
//					
//				}
//				System.out.println(dao.count());
				AccountDao dao = context.getBean("accountDao",AccountDao.class);
				dao.resetMoney();
				try {
					dao.transferMoney("zhangsan", "lisi", 200);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				List<Account> accountList=dao.accountList();
				for(Account account: accountList){
					System.out.println(account.getUser()+":"+account.getBalance());
					
				}
				((ConfigurableApplicationContext)context).close();
			

	}


	

}
