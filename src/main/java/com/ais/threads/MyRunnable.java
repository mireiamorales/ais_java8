package com.ais.threads;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
