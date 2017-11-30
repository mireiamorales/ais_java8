package com.ais.newinterfaces;

@FunctionalInterface
public interface IStrategy {
	
	public String sayHelloTo(String name);
	
	public default String sayHelloWorld()
	{
		return "Hello World";
	}

}
