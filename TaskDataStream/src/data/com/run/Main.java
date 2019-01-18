package data.com.run;

import data.com.controller.DataStream;

public class Main {

	public static void main(String[] args) {

		DataStream ds = new DataStream();
		ds.addFile();
		ds.printFile();
	}

}
