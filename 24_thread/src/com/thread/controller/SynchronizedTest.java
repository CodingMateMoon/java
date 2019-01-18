package com.thread.controller;

public class SynchronizedTest implements Runnable {
	private long depository = 10000L;
	private boolean flag = false;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 20; i++) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (getDepository() <= 0) {
					break;
				}
				withDraw(500);
				if (flag) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();
				}
			}
		}
	}

	public /*synchronized*/ void withDraw(long money) {

		if (flag) {
			flag = false;
		} else {
			flag = true;
		}
		
		if (getDepository() > 0) {
			depository -= money;
			System.out.println(Thread.currentThread().getName() + "잔액" + getDepository());
		} else {
			System.out.println(Thread.currentThread().getName() + "잔액" + getDepository() + "잔액이 부족합니다");
		}
	}

	public long getDepository() {
		return depository;
	}

	public void setDepository(long depository) {
		this.depository = depository;
	}

}
