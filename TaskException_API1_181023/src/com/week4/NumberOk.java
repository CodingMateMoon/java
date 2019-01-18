package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOk {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		NumberOk no = new NumberOk();
		while (true) {
			int userNum, result, count = 0;
			int answer = (int) (Math.random() * 100 + 1);
			
			do {
				userNum = no.getNumber();
				result = no.questionNumber(answer, userNum);
				count++;
			} while (result != 0);
			System.out.println("맞았습니다.(" + count + "번)");
			System.out.print("계속 하시겠습니까? (y/n) : ");
			char c = br.readLine().charAt(0);
			if (!('y' == c || 'Y' == c)) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	public int getNumber() throws NumberFormatException, IOException {

		System.out.print("정수 입력 : ");
		int n = -1;
		n = Integer.parseInt(br.readLine());

		return n;
	}

	public int questionNumber(int answer, int userNum) {
		if (answer == userNum) {
			return 0;
		} else if (answer > userNum) {
			System.out.println("크다");
			return -1;
		} else {
			System.out.println("작다");
			return 1;
		}
	}
}
