package extraEx;

import java.util.Scanner;

public class PrimeNumber {

	public void primeNum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		int count=0;
		if(su>=2) {
			for(int i=1;i<=su;i++) {
				if(su%i==0) count++;			
			}
			if(count==2) System.out.println("�Ҽ���");
			else System.out.println("�Ҽ��� �ƴϴ�");
		}
		else System.out.println("�߸� �Է��ϼ̽��ϴ�. 2�̻��� ������ �Է��ϼ���!");
		
		
	}
}
