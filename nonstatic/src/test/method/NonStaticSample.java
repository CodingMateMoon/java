package test.method;

public class NonStaticSample {
	
	public void printLottoNumber() {
		int[] lotto = new int[6];
		int i;
		
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
	}
}
