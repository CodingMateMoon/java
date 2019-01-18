package com.mvc.controller;

import java.util.Scanner;

import com.mvc.model.Calculate;
import com.mvc.model.Output;
import com.mvc.model.PayTable;
import com.mvc.model.Salary;

public class PayTableTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salary[] pt = new Salary[3];
		PayTable ptable;
		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽",800000,1,4);
		pt[2] = new PayTable("모팔모",650000,6,2);
		System.out.print("인센티브(%)입력 : ");
		PayTable.setIncentive(sc.nextFloat());
		System.out.println("***** 급여명세서 *****");
		System.out.println("-------------------------------------------------------------");
		System.out.println("이름\t기본급\t가족수\t가족수당\t시간외근무\t시간외수당\t     세금\t  인센티브(%)   성과금\t실수령액");
		for (int i = 0; i < PayTable.getCount(); i++) {
			
			Calculate cal = (Calculate) pt[i];
			cal.calc();
			Output o = (Output) pt[i];
			o.out();
			/*ptable = (PayTable) pt[i];
			ptable.calc();
			ptable.out();*/
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("인원수 : " + PayTable.getCount() + "명");
	}
}
