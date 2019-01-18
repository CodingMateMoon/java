package com.abstractObject.model.vo;

public class Cannon extends PrintDriver implements Print{

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		cannonPrint();
	}

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		cannonScanning();
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		cannonCopy();
	}

	public void cannonPrint() {
		System.out.println("cannon 프린트");
	}
	
	public void cannonScanning() {
		System.out.println("cannon 스캔");
	}
	
	public void cannonCopy() {
		System.out.println("cannon 복사");
	}
}
