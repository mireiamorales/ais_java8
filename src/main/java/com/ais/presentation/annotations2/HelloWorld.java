package com.ais.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="helloWorld")
public class HelloWorld {

	private String hello;

	public String getHello() {
		return hello;
	}
	
	@Autowired
	@Value("Hello wolrd From Annotations!")
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld(){
		
	}	
	
}
