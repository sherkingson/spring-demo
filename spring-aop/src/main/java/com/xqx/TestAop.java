package com.xqx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Calculator calculator = context.getBean("Calculator",Calculator.class);
		System.out.println(calculator.add(2, 1));
		System.out.println(calculator.sub(3, 1));
		((ConfigurableApplicationContext)context).close();
	}

}
