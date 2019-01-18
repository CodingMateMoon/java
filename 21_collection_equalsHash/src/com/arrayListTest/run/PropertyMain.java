package com.arrayListTest.run;

import java.io.IOException;

import com.arrayListTest.controller.PropertiesTest;

public class PropertyMain {

	public static void main(String[] args) {

		PropertiesTest pt = new PropertiesTest();
		try {
			pt.properties();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
