package easyLevel;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input year and press Enter : ");
		int year = sc.nextInt();

		if (year % 100 == 0) {
			System.out.println("Non-leap year");

		} else if (year % 400 == 0) {
			System.out.println("Leap year");
		} else if (year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Non-leap year");
		}

	}

}
