package ncs.test7;

public class TestSort {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int i, j, maxIndex;
		System.out.print("before : ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 50) + 51; 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (i = 0; i < arr.length - 1; i++) {
			maxIndex = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[maxIndex] < arr[j])
					maxIndex = j;
			}
			if (maxIndex != i) {
				int temp = arr[i];
				arr[i] = arr[maxIndex];
				arr[maxIndex] = temp;
			}
		}
		System.out.print("after : ");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
