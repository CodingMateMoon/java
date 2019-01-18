package com.abstractObject.model.vo;

public class Samsong extends PrintDriver implements Print{

	// Alt + S , V
	@Override
	public void print() {
		// TODO Auto-generated method stub
		samprint();
	}

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		samScanner();
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		samCopy();
	}

	public Samsong() {
		// TODO Auto-generated constructor stub
	}
	
	public void samprint() {
		System.out.println("삼성프린트 출력");
	}
	
	public void samScanner() {
		System.out.println("삼성프린트 스캐너중");
	}
	
	public void samCopy() {
		System.out.println("삼성프린트 복사");
	}
}
