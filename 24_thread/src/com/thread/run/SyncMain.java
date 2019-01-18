package com.thread.run;

import com.thread.controller.SynchronizedTest;

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronizedTest syn = new SynchronizedTest();
		Thread mother = new Thread(syn, "mother");
		Thread sun = new Thread(syn, "sun");
		
		mother.start();
		sun.start();
	
	}

}
