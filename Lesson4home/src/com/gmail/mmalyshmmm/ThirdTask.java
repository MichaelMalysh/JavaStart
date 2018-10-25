package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The multiplication table of what number do you want? ");
		int number = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= 9; i++) {
			sum = i * number;
			System.out.println(i + " * " + number + " = " + sum);
		}

	}

}
