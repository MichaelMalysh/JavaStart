package hardLevel;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = sc.nextInt();
		System.out.println("Input y: ");
		int y = sc.nextInt();

		int r = 4;

		double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		if (result <= r) {
			System.out.println("In the circle");
		} else {
			System.out.println("Outside the circle");
		}

	}

}
