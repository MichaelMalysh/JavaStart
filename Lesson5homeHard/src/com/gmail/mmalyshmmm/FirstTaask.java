package com.gmail.mmalyshmmm;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTaask {

	public static void main(String[] args) {

		int[][] array = new int[6][6];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = 1 + j;
			}
		}
		for (int[] row : array) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deg of coup : 90, 180, 270: ");
		int deg = sc.nextInt();

		switch (deg) {
		case 90://заполнение числами по значениям диагонали
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = array[i][i];
				}
			}
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}
			break;
		case 180://значения нижней строки в обратном порядке присваиваються первой
			for (int i = 0; i < array.length-i; i++) {
				for (int j = 0; j < array[0].length; j++) {

					int temp = array[i][j];
					array[i][j] = array[array.length-i-1][array.length-j-1];
					array[array.length-i-1][array.length-j-1] = temp;
					}
				}
			
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}

			break;
		case 270:
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length - i - 1; j++) {
					int temp = array[i][j];
					array[i][j] = array[j][array.length - 1 - i];
					array[j][array.length - 1 - i] = array[array.length - 1 - i][array.length - 1 - j];
					array[array.length - 1 - i][array.length - 1 - j] = array[array.length - 1 - j][i];
					array[array.length - 1 - j][i] = temp;
				}
			}
			for (int[] row : array) {
				System.out.println(Arrays.toString(row));
			}
			break;
		default:
			System.out.println("Input Error!");
		}
sc.close();
	}
}
