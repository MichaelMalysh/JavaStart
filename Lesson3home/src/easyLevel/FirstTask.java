package easyLevel;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a: ");
		int a = sc.nextInt();
		System.out.println("Enter number a: ");
		int b = sc.nextInt();
		System.out.println("Enter number a: ");
		int c = sc.nextInt();
		System.out.println("Enter number a: ");
		int d = sc.nextInt();

		int max;

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		System.out.println("Max number: " + max);

	}

}
