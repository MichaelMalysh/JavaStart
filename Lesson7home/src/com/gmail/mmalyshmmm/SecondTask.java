package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array");
		int n = sc.nextInt();
		int[] arr = new int[n-1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20);
		}
		System.out.println(newMethod(arr));

		sc.close();
	}

	public static String newMethod(int[] a) {
		StringBuilder sb = new StringBuilder("[");
		for (int i : a) {
			sb.append(i+",");
		}
		sb.append(a.length+"]");
		String text = sb.toString();
		return text;
	}

}
