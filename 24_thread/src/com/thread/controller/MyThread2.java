package com.thread.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyThread2 implements Runnable {

	private String name;
	
	public MyThread2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			Calendar cal = new GregorianCalendar();
			System.out.println(name + i + "^.~" + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
		}
		System.out.println(name + "쓰레드 종료");
		/*for (int i = 0; i < 10; i++) {
			System.out.println(name + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "Runnable 인터페이스 종료");*/
	}

}
