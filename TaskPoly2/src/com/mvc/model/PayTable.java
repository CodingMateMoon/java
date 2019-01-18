package com.mvc.model;

public class PayTable extends Salary implements Calculate, Output{

	public PayTable() {
	}

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	public void calc() {
		long familyP, overtimeP, tax, incenP, totalPay;
		if (getFamily() < 3) {
			familyP = getFamily() * 20000;
		} else {
			familyP = 60000;
		}
		overtimeP = getOvertime() * 5000;
		tax = (long) (getPay() * 0.1);
		incenP = (long) (getIncentive() * getPay());

		setFamilyP(familyP);
		setOvertimeP(overtimeP);
		setTax(tax);
		setIncenP(incenP);

		totalPay = getPay() + getFamilyP() + getIncenP() + getOvertimeP() - getTax();
		setTotalPay(totalPay);
	}

	public void out() {
		/*String name, long pay, long familyP, long overtimeP, long incenP, long tax, long totalPay, int family,
		int overtime*/
		/* name, pay, family, familyP, overtime, overtimeP, tax, incentive, incenP, totalPay*/
		
		
		System.out.printf("%-8s %-8d %-7d %-8d %-8d %-8d %-8d %-8.1f %-8d %-8d \n", getName(), getPay(),
					getFamily(), getFamilyP(), getOvertime(), getOvertimeP(), getTax(), getIncentive(), getIncenP(), getTotalPay());
		
	}
}
