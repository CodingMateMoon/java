package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		String[] input = sc.nextLine().split(" ");
		if (input.length != 5) {
			System.out.println("다시 입력하세요!");
		} else {
			double[] nums = new double[input.length];
			int i;
			
			for (i = 0; i < input.length; i++) {
				nums[i] = Double.parseDouble(input[i]);
				if (10 <= nums[i] && nums[i] <= 99) {
					
				} else {
					System.out.println("다시 입력하세요");
					flag = false;
					break;
				}
			}
			
			if (flag) {
				double total = 0;
				String grade;
				total += ((nums[0] + nums[1]) / 2) * 0.6;
				total += ((nums[2] + nums[3]) / 2) * 0.2;
				total += nums[4] * 0.2;
				if (total >= 90) {
					grade = "Gold Class";
				} else if (total >= 80) {
					grade = "Silver Class";
				} else if (total >= 70) {
					grade = "Bronze Class";
				} else {
					grade = "Normal Class";
				}
				System.out.println("평가점수 : " + total + "점");
				System.out.println("class : " + grade);
			}
			
		}
		
		
	}

}
