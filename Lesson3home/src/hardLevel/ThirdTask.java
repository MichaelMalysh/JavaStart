package hardLevel;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of your ticket and press Enter :");
		int ticket = sc.nextInt();

		int a = ticket / 1000;
		int b = ticket % 1000 / 100;
		int c = ticket % 100 / 10;
		int d = ticket % 10;

		if (ticket > 9999) {
			System.out.println("Long number of ticket");
		} else if (a + b == c + d) {
			System.out.println("Happy ticket");
		} else {
			System.out.println("Bad luck");
		}

	}

}
