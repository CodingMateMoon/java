package com.abstractObject.model.vo;

public class LgPrint extends PrintDriver implements Print{

	public void print() {
		System.out.println("LG 프린트");
	}
	
	public void scanner() {
		System.out.println("LG 스캐너");
	}
	
	public void copy() {
		System.out.println("LG 카피");
	}
	
	/*public void Lgprint() {
		System.out.println("LG 프린트");
	}
	
	public void LgScanner() {
		System.out.println("LG 스캐너");
	}
	
	public void LgCopy() {
		System.out.println("LG 카피");
	}*/
}
