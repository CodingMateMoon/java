package com.thread.controller;

public class MyThread extends Thread {

	private String name;
	
	public MyThread() {}
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println(name + i);
			/*try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println(name + "쓰레드 종료");
	}
}
