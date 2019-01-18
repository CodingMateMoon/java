package com.twiceDouble.controller;

public class TwiceDoubleTest {

	public void twiceDouble() {
		int i, j, n = 3;
		char[][] array = new char[n][n];
		array[0][0] = 10;
		array[0][1] = 11;
		
		char c = 'a';
		int val;
		int[][] arrays = new int[3][];
		arrays[0] = new int[4];
		arrays[1] = new int[5];
		arrays[2] = new int[10];
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				if (i % 2 == 1)
					array[i][j] = (char) (c + n * (i + 1) - j - 1);
				else
					array[i][j] = (char) (c + n * i + j);
			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
