package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input decimal point");
		int count = sc.nextInt();

		pi(count);

	}

	public static void pi(int count) {
		for (int i = 2; i <= count; i++) {
			if (i >= 11) {
				System.out.printf((i - 1) + ". PI= %." + i + "f %n", Math.PI);
			} else {
				System.out.printf((i - 1) + ".  PI= %." + i + "f %n", Math.PI);
			}
		}

	}
}
