package com.ais.newinterfaces;

public class Main {

	public static void main(String[] args) {
		
		IStrategy strategy = (name) -> "Hello " + name;
		
		System.out.println(strategy.sayHelloTo("Oscar Blancarte"));
		System.out.println(strategy.sayHelloWorld());

	}

}
