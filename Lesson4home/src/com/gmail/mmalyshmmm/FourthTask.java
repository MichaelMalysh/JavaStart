package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Height of rectangle :");
		int heigth = sc.nextInt();
		System.out.println("Width of rectangle :");
		int width = sc.nextInt();

		for (int i = 1; i <= heigth; i += 1) {
			for (int j = 1; j <= width; j += 1) {
				if(i==1 || i==heigth){
					System.out.print("*");
				}else if(j==1 || j== width){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
