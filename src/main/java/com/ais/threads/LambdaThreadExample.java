package com.ais.threads;

public class LambdaThreadExample {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		
		Thread thread2 = new Thread(new MyRunnable());
		
		Runnable runnable2 = new Runnable(){
			@Override
			public void run(){
				System.out.println("Thread name : " + Thread.currentThread().getName());
			}
		};
		
		Thread thread3 = new Thread(runnable2);
		
		Runnable runnable3 = () -> {
			System.out.println("Thread name : " + Thread.currentThread().getName());
		};
		
		Thread thread4 = new Thread(runnable3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		

	}

	

}
