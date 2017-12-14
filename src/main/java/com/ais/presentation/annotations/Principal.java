package com.ais.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AbstractApplicationContext appContext= new AnnotationConfigApplicationContext(SpringConfiguration.class);

		HelloWorld helloworld  =(HelloWorld)appContext.getBean("helloWorld");
		
		System.out.println(helloworld.getHello());
		
		appContext.close();
	}

}
