package com.gmail.mmalyshmmm;

import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size: ");
		int size = sc.nextInt();

		int[] array = new int[size];

		System.out.println("Input elements of array: ");
		for (int i = 0; i < array.length; i += 1) {
			int elements = sc.nextInt();
			array[i] = elements;
		}
		System.out.println();
		System.out.println(Arrays.toString(array));

	}
}
