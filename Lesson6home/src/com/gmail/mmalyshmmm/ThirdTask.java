package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of rectangle and press Enter");
		int length = sc.nextInt();
		System.out.println("Input width of rectangle and press Enter");
		int width = sc.nextInt();

		if (length == width) {
			System.out.println("Input Error");
		} else {

			rectangle(length, width);
		}
		sc.close();
	}

	static void rectangle(int length, int width) {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
