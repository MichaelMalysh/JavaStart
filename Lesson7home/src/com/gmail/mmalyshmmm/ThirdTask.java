package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binar number");
		StringBuilder BinarNumber = new StringBuilder(sc.nextLine());
		
		System.out.println("Decimal number = "+binarToDecimal(BinarNumber));

	}

	public static int binarToDecimal(StringBuilder BinarNumber) {
		BinarNumber.reverse();
		int result = 0;
		for (int i = 0; i < BinarNumber.length(); i++) {
			result += (Integer.parseInt(BinarNumber.substring(i,i+1))*(int) Math.pow(2, i));
			
		}
		return result;
	}

}
