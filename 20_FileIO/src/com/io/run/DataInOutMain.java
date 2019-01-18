package com.io.run;

import com.fileInOutput.DataInputOutput;
import com.fileInOutput.ObjectInputOutput;

public class DataInOutMain {

	public static void main(String[] args) {
		DataInputOutput dio = new DataInputOutput();
		dio.saveFile();
		dio.loadFile();
		ObjectInputOutput oio = new ObjectInputOutput();
		oio.saveFile();
	}

}
