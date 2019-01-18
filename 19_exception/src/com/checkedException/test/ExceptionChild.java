package com.checkedException.test;

import java.io.EOFException;
import java.io.IOException;

public class ExceptionChild extends ExceptionFunction{
	
	@Override
	public void methodA() throws EOFException{
		
	}
	
	@Override // IOException
	public void methodB() throws IOException /*EOFException, FileNotFoundException*/ {
		
	}
}
