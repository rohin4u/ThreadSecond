package com.spiderscrawl.runnable;

public class TestThread {

	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		
		Thread t = new Thread(runnable);
		
		t.start();
		

		for(int i=0; i<5; i++) {
			System.out.println("in main method");

		}
		

	}

}
