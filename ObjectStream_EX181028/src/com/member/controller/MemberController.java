package com.member.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.member.model.vo.Member;

public class MemberController {

	public void saveData() {
//		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"))){

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Members.txt"))) {

			ArrayList<Member> list = new ArrayList<Member>();
			Member m = new Member("abc12", "1234", "010", "a@daum.net");
			list.add(m);
			oos.writeObject(list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void loadData() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Members.txt"))){

			ArrayList<Member> list = (ArrayList<Member>) ois.readObject();
			System.out.println(list.get(0));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
