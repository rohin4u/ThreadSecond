package com.spiderscrawl;

public class ThreadDemo extends Thread {
	
	public void run() {
		
		for(int i=0; i<5; i++) {
		System.out.println("in child thread");
		}
	}

}
