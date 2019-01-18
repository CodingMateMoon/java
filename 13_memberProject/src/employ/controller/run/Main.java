package employ.controller.run;

import employee.model.vo.Employee;

public class Main {

	public static void main(String[] args) {

		Employee el = new Employee();
		el.setEmpNo(100);
		el.setEmpName("홍길동");
		el.setDept("영업부");
		el.setJob("과장");
		el.setAge(25);
		el.setGender('남');
		el.setSalary(2500000);
		el.setBonusPoint(0.05);
		el.setPhone("010-1234-5678");
		el.setAddress("서울시 강남구");
		
		System.out.println(el.getEmpNo() + " " + el.getEmpName() + " " + el.getDept() + " "
				+ el.getJob() + " " + el.getAge() + " " + el.getGender() + " " + el.getSalary()
				+ " " + el.getBonusPoint() + " " + el.getPhone() + " " + el.getAddress());
	}

}
