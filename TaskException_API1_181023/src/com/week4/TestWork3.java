package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import dcom.week4.Employee;

public class TestWork3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> al = new ArrayList();
		String name;
		int i, age, salary;
		double taxRate, realSalary; // 소수둘째자리
		for (i = 0; i < 2; i++) {
			System.out.print("사원명 : ");
			name = br.readLine();
			System.out.print("나이 : ");
			age = Integer.parseInt(br.readLine());
			System.out.print("급여 : ");
			salary = Integer.parseInt(br.readLine());
			System.out.print("세율 : ");
			taxRate = Double.parseDouble(br.readLine());
			realSalary = salary - (salary * taxRate);
			Employee e = new Employee(name, age, salary, taxRate, realSalary);
			al.add(e);
		}
		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
		});
		
		System.out.println(Arrays.toString(al.toArray()));
	}
}
