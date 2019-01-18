package ncs.test8;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] students = new double[3][5];
		int i, j;
		for (i = 0; i < students.length; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("¼ºÀû" + (j + 1) + " : ");
				students[i][j] = sc.nextDouble();
			}
		}
		
		for (i = 0; i < students.length; i++) {
			students[i][3] = students[i][0] + students[i][1] + students[i][2];
			students[i][4] = students[i][3] / 3;
		}
		System.out.println("index  °ú¸ñ1  °ú¸ñ2  °ú¸ñ3  ÃÑÁ¡  Æò±Õ");
		
		for (i = 0; i < students.length; i++) {
			System.out.print(i + "   ");
			for (j = 0; j < students[i].length; j++) {
				System.out.print(students[i][j] + " ");
			}
			System.out.println();
		}
	}

}
