package test.method.controller;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int p : lotto) {
			System.out.print(p + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, String s) {
		for (int i = 0; i < num; i++) {
			System.out.println(i + ". " + s);
		}
	}
	
	public char alphabette() {
		int val = (int) (Math.random() * 26);
		System.out.println("a : " + (int)'a');
		System.out.println("A : " + (int)'A');
		return (char) (val + 'A');
	}
	
	public String mySubstring(String s, int beginIndex, int endIndex) {
		String result = "";
		
		for (int i = beginIndex; i < endIndex; i++) {
			result += s.charAt(i);
		}
		
		if (result.equals("")) {
			return null;
		} else {
			return result;
		}
	}
	
	public int[] intArrayAllocation(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		return arr;
	}
	
	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void swap(int[] arr, int srcIndex, int dstIndex) {
		int temp = arr[srcIndex];
		arr[srcIndex] = arr[dstIndex];
		arr[dstIndex] = temp;
	}
	
	public void sortDescending(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[maxIndex] < arr[j]) {
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	public void sortAscending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public int countChar(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	public int totalValue(int a, int b) {
		int sum = 0;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int pCharAt(String s, char c) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
	
	public String pConcat(String s1, String s2) {
		return s1 + s2;
	}
}
