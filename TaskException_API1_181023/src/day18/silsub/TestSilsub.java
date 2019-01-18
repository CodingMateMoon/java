package day18.silsub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSilsub {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CharacterProcess cp = new CharacterProcess();
		System.out.print("문자열 입력 : ");
		String input = null;
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(cp.countAlpha(input));
		} catch (CharCheckException ce) {
			ce.printStackTrace();
		}
	}

}
