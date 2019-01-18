package com.checkedException.test;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFunction {

	public void methodA() throws EOFException{
		System.out.println("A");
		throw new EOFException();
//		methodB();
	}
	
	public void methodB() throws IOException{
		System.out.println("B");
		methodC();
	}
	
	public void methodC() throws FileNotFoundException {
		System.out.println("C");
		System.exit(0);
		// 강제로 예외를 발생시키는 구문!
		throw new FileNotFoundException();
//		throw new IOException();
		/*try {
		throw new IOException();
		} catch(Exception e) {
			
		}*/
	}

	
	
}
