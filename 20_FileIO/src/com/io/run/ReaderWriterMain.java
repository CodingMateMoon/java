package com.io.run;

import com.fileInOutput.ReaderWriter;

public class ReaderWriterMain {

	public static void main(String[] args) {

		ReaderWriter rw = new ReaderWriter();
		rw.saveFile();
		rw.loadFile();
	}

}
