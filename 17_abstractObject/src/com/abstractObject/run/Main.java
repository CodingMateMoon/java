package com.abstractObject.run;

import com.abstractObject.model.vo.BsPrint;
import com.abstractObject.model.vo.Cannon;
import com.abstractObject.model.vo.ChildAbstract;
import com.abstractObject.model.vo.Laundry;
import com.abstractObject.model.vo.LgPrint;
import com.abstractObject.model.vo.Print;
import com.abstractObject.model.vo.Samsong;
import com.abstractObject.model.vo.TestAbstract;

public class Main {

	public static void main(String[] args) {

//		TestAbstract ta = new TestAbstract();
		ChildAbstract ca = new ChildAbstract();
		System.out.println(ca.getName());
		// 추상클래스는 추상메소드가 없어도 선언 가능
		// 사용방법은 동일하게 상속을 이용해서 사용해야함 
//		TestAbstract2 ta2 = new TestAbstract2();
		
		// 추상클래스는 생성이 되지 않지만 객체자료형 변수로 활용 가능
		TestAbstract ta = new ChildAbstract();
		ta.getName();
		// 동적바인딩에 의해 childAbstract 클래스의 오버라이드된 메소드가 호출됨
		System.out.println(ta.getName());
//		Samsong printer = new Samsong();
		
//		LgPrint printer2 = new LgPrint();
		/*if (printer instanceof Cannon)
		printer.cannonPrint();
		printer.cannonScanning();
		printer.cannonCopy();*/
		
		/*PrintDriver printer = new Cannon();
		printer = new LgPrint();
		printer = new Samsong();
		
		
		printer.print();
		printer.scanner();
		printer.copy();*/
		
		Print printer = new Cannon();
		printer = new LgPrint();
		printer = new Samsong();
		
		
		printer.print();
		printer.scanner();
		printer.copy();
		
		// 메소드를 자식에게 강제구현!
		// 부모는 그 메소드로 모든것을 실행가능!
		// 상위 참조 변수에 오버라이드할 메소드가 반드시 있어야 하위 객체에서 호출 가능
		/*PrintDriver print = new LgPrint()new HP();
		print.print();
		print.copy();
		print.scanner();*/
		BsPrint bs = new BsPrint();
		Print print = new BsPrint();  /*new LgPrint()*/ /*new LgPrint();*/
		
		Laundry l = new BsPrint();
		print.copy();
		
		print.print();
		print.copy();
		print.scanner();
	}

}
