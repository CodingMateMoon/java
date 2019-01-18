package test.method.run;

import java.util.Arrays;

import test.method.controller.NonStaticSample;

public class Main {

	public static void main(String[] args) {
		
		new NonStaticSample().printLottoNumbers();
		new NonStaticSample().outputChar(10, "gogo");
		System.out.println(new NonStaticSample().alphabette());
		System.out.println(new NonStaticSample().mySubstring("abcdefghijk", 2, 5));
		System.out.println(new NonStaticSample().mySubstring("abcdefghijk", 7, 5));
		System.out.println(Arrays.toString(new NonStaticSample().intArrayAllocation(10)));
		int[] arr = {10, 7, 8, 1, 2, 6, 9, 3, 4, 5};
		new NonStaticSample().display(arr);
		new NonStaticSample().swap(arr, 1, 2);
		new NonStaticSample().display(arr);
		new NonStaticSample().sortDescending(arr);
		new NonStaticSample().display(arr);
		new NonStaticSample().sortAscending(arr);
		new NonStaticSample().display(arr);
		System.out.println(new NonStaticSample().countChar("hello nice to meet you", 'l'));
		System.out.println(new NonStaticSample().totalValue(2, 5));
		System.out.println(new NonStaticSample().pCharAt("innovation", 't'));
		System.out.println(new NonStaticSample().pConcat("haha", "hoho"));
	}

}
