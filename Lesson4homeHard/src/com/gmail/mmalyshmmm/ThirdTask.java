package com.gmail.mmalyshmmm;
/*
 * It`s a simple output of the hourglass different size.
 * It`s my starting in Java language.
 * I hope you like this.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {

		String indentDown = " ";
		String indentUp = "";
		int width = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter odd width of hourglass: ");
		try{
		width = sc.nextInt();
		if (width % 2 == 0){
			throw new InputMismatchException();
		}
		}catch(InputMismatchException e){
			System.out.println("Enter odd integer number");
			System.exit(0);
		}finally {
			sc.close();
		}
		
		for (int i = width; i > 0; i -= 2) {
			int test = width;
			while (i<test){
				test-=2;
				indentDown= " ";
				System.out.print(indentDown);
			}
			for (int j = i; j > 0; j -= 1) {
				System.out.print("*");
			}
			System.out.println();
	
		}
		for (int i = 3; i <= width; i += 2) {
			
			int test = width;
			
			while (test> i) {
				test -= 2;
				indentUp = " ";
				System.out.print(indentUp);
			}

			for (int j = i; j > 0; j -= 1) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
