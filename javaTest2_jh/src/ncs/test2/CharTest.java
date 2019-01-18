package ncs.test2;

public class CharTest {

	public static void main(String[] args) {

		String s = args[0];
		char[] arr = s.toCharArray();
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (i < (length - 1 - i)) {
				char temp = arr[i];
				arr[i] = arr[length - 1 - i];
				arr[length - 1 - i] = temp;
			}
		}
		
		for (int i = 0; i < length; i++) {
			if ('a' <= arr[i] && arr[i] <= 'z') {
				arr[i] -= 'a' - 'A';
			}
			System.out.print(arr[i]);
		}
		
		
	}

}
