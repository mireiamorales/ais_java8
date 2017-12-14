package com.ais.presentation.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(name ="helloWorld")
	public HelloWorld HelloWorld(){		
		return new HelloWorld();
	}
}
