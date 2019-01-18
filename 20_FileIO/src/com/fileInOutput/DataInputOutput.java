package com.fileInOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutput {

	public void saveFile() {

		try (FileOutputStream fos = new FileOutputStream("readme.txt")) {
			DataOutputStream das = new DataOutputStream(fos);
			das.writeInt(19);
			das.writeUTF("유병승");
			das.writeChar('남');
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadFile() {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("readme.txt"))){
			
			// DataInputStream으로 데이터를 받아올 때는 자료형에 준하여 받아오기 때문에 입력한 순서의 자료형에 맞춰서 불러와야함
			
			int age = dis.readInt();
			String name = dis.readUTF();
			char gender = dis.readChar();
			System.out.println(age + " " + name + " " + gender);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
