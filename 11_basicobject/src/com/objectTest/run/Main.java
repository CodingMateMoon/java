package com.objectTest.run;

import com.objectTest.model.vo.*;
import com.objectTest.model.vo.MarryMember;

public class Main {

	public static void main(String[] args) {

		MarryMember member1 = new MarryMember();
		member1.setName("유병승");
		System.out.println(member1.getName());
		member1.setName("");;
		System.out.println(member1.getName());
		
		//default클래스는 다른 패키지에서 호출할 수 없다
//		DefaultTest dt = new DefaultTest();
	}

}
