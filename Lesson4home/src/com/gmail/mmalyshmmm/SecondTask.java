package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class SecondTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n ( 4<n<16 ): ");
		int n = sc.nextInt();
		int sum = n;
		System.out.print(n+"!= ");

		if (n < 4 || n > 16) {
			System.out.println("Input Error :(");
		} else {
			while (n > 1) {
				n--;
				sum = sum * n;
			}
			System.out.print(sum);
		}
	}
}
