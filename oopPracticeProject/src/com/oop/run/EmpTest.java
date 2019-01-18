package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {

	private static Employee[] employees;
	private static int index;
	static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {

		employees = new Employee[10];
		index = 0;
		while (true) {
			System.out.println("*********사원 정보 관리 프로그램************");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				employees[index] = new Employee();
				employees[index++].empInput();
				break;
			case 2:
				System.out.print("사원번호 입력 : ");
				int empNo = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < index; i++) {
					if (empNo == employees[i].getEmpNo()) {
						// employees[i] = modifyMenu(employees[i]);
						modifyMenu(employees[i]);
					}
				}
				break;
			case 3:
				break;
			case 4:
				for (int i = 0; i < index; i++) {
					employees[i].empOutput();
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

	public static void modifyMenu(Employee emp) {
		// Employee emp = new Employee(e.getEmpNo(), e.getEmpName(), e.getSalary(),
		// e.getDept(), e.getJob());

		while (true) {
			System.out.println("***** 사원 정보 수정 메뉴 *****");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동");
			System.out.println("번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				System.out.print("변경할 이름 입력 : ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2:
				System.out.print("변경할 급여 입력 : ");
				int salary = sc.nextInt();
				sc.nextLine();
				emp.setSalary(salary);
				break;
			case 3:
				System.out.print("변경할 부서 입력 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4:
				System.out.print("변경할 직급 입력 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 5:
				System.out.println("사원 정보 수정 종료");
				// return emp;
				return;
			}
		}
	}

	public static void main(String[] args) {

		mainMenu();
	}

}
