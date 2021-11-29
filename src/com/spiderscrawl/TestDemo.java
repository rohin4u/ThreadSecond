package com.spiderscrawl;

public class TestDemo {

	public static void main(String[] args) {
	
		ThreadDemo threadDemo = new ThreadDemo();
		
		threadDemo.start();
		
		
//		threadDemo.setName("Mayur Thread");
//		System.out.println("Thread Priority Number : "+threadDemo.getPriority());
		
		
		
//		
//		threadDemo.setPriority(7);
//		
//		System.out.println("Thread Priority Number : "+threadDemo.getPriority());
//		
//		threadDemo.setPriority(15);
//		System.out.println("Thread Priority Number : "+threadDemo.getPriority());
		
		for(int i=0 ; i<5; i++) {
			System.out.println("in main thread");
		}

	}

}
