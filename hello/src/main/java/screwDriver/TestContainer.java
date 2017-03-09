package screwDriver;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
			ScrewHelper sd=(ScrewHelper)context.getBean("ScrewHelper");
			sd.use();
	}

}
