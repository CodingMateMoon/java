package array;

public class Test6 {

	public static void main(String[] args) {
		int i, j, k, index = 0;
		;
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr = new int[array.length * array[0].length];

		for (i = 0; i < array.length; i++) {
			label : for (j = 0; j < array[i].length; j++) {

				if (array[i][j] % 3 == 0) {
//					boolean flag = true;
					for (k = 0; k < index; k++) {
						if (array[i][j] == copyAr[k]) {
//							flag = false;
							continue label;
						}
					}
//					if (flag) {
						copyAr[index++] = array[i][j];
//					}
				}
			}
		}

		System.out.print("copyAr : ");
		for (i = 0; i < index; i++) {
			System.out.print(copyAr[i] + " ");
		}
	}

}
