package easyLevel;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Input A side of the triangle: ");
		double a = sc.nextDouble();
		System.out.println("Input B side of the triangle: ");
		double b = sc.nextDouble();
		System.out.println("Input C side of the triangle: ");
		double c = sc.nextDouble();
		
		
		if ((a+b>c) && (b+c>a) && (a+c>b)) {
			System.out.println("Triangle exists");
		}else {
			System.out.println("Triangle non-exists");
		}

	}

}
