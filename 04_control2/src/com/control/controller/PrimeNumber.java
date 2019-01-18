package extraEx;

import java.util.Scanner;

public class PrimeNumber {

	public void primeNum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		int count=0;
		if(su>=2) {
			for(int i=1;i<=su;i++) {
				if(su%i==0) count++;			
			}
			if(count==2) System.out.println("소수다");
			else System.out.println("소수가 아니다");
		}
		else System.out.println("잘못 입력하셨습니다. 2이상의 정수를 입력하세요!");
		
		
	}
}
