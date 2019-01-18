package com.thread.run;

import com.thread.controller.MyThread;
import com.thread.controller.MyThread2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread("병승");
		MyThread t2 = new MyThread("재민");
		Thread t3 = new Thread(new MyThread2("일교"));
		// 쓰레드 실행
		t1.start();
		t2.start();
		t3.start();
		// 쓰레드 우선순위 정하기
		t1.setPriority(10);
		t3.setPriority(1);
		
		// 지금 돌아가고 있는 쓰레드를 중단시키는 역할 : join 끼어드는 것
	/*	try {
			t1.join(5000); // 쓰레드 실행중이면 끝날때까지 혹은 5초 동안 기다리다 Main스레드 수행 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		for(int i = 0; i < 10; i++) {
			System.out.println("진우");
		}
		
		System.out.println("메인스레드 종료");
	}

}
