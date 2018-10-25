package hardLevel;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 6-digit number: ");
		int x = sc.nextInt();
		int x1 = x;
		int x2 = 0;
		while (x / 1 != 0) {
			x2 *= 10;
			x2 += x % 10;
			x /= 10;

		}
		if (x1 == x2) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Ordinary number");
		}

	}

}
