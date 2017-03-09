package screwDriver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
			ScrewDriver sd=(ScrewDriver)context.getBean("screwDriver");
			sd.use();
	}

}
