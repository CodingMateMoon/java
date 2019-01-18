package oop.staticmethod.run;

import oop.staticmethod.StaticMethod;

public class Main {

	public static void main(String[] args) {
		
		StaticMethod sm = new StaticMethod();
		sm.setValue("abcde");
		sm.toUpper();
		System.out.println(sm.getValue());
		System.out.println(sm.valueLength());
		System.out.println(sm.valueConcat("yoyo"));
	}

}
