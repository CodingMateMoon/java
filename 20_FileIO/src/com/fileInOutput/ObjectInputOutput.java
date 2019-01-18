package com.fileInOutput;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.fileInOutput.model.vo.Member;

public class ObjectInputOutput {

	// 어플케이션 실행할 때 램에 다 올리고 종료할 때 다 저장
	public void saveFile() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"))){
//			Member m = new Member("user1", "user1", "한혜진1", 25, '여', "han@platinum", "플레티넘");
			Member[] members = new Member[3];
			members[0] = new Member("user1", "user1", "한혜진1", 25, '여', "han@platinum", "플레티넘");
			members[1] = new Member("jeamin", "jeajea", "신재민", 26, '남', "jeamin@silver", "못하는 실버");
			members[2] = new Member("chanwoong", "chanchan", "왕찬웅", 20, '남', "chan@gold", "어린이 골드");
			
			/*for (int i = 0; i < members.length; i++) {
				oos.writeObject(members[i]);
			}*/
			
			oos.writeObject(members);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadFile() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj"))){
		/*	Member[] members = new Member[100];
			for (int i = 0; i < members.length; i++) {
				try {
				members[i] = (Member) ois.readObject();
				} catch(EOFException e) {
					System.out.println("EOF Exception");
				}
			}
			
			for (Member m : members) {
				if (m != null)
					System.out.println(m);
			}*/
			Member[] members = (Member[]) ois.readObject();
			
			for (Member m : members) {
				System.out.println(m);
			}
//			Member m = (Member) ois.readObject();
			/*Member m = null;
			Object obj = ois.readObject();
			if (obj instanceof Member) {
				m = (Member) obj;
			}
			System.out.println(m);*/
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cfe) {
			cfe.printStackTrace();
		}
	}
}
