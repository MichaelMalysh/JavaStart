package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FirstTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of bands: ");
		int bands = sc.nextInt();
		System.out.println("Input haight of wallpaper: ");
		int height = sc.nextInt();

		for (int i = 1; i <= height; i += 1) {
			for (int j = 1; j <= bands; j += 1) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}

	}
}
