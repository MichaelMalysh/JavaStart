package hardLevel;

import java.util.Scanner;



public class SecondTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input x: ");
		int x0 = sc.nextInt();
		System.out.println("Input y: ");
		int y0 = sc.nextInt();

		int x1 = 6;
		int x2 = 4;
		int x3 = 0;
		int y1 = 1;
		int y2 = 4;
		int y3 = 0;

		int a = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
		int b = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
		int c = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			System.out.println("In the triangle :)");
		} else {
			System.out.println("Outside the triangle :(");
		}

	}

}
