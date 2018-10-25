package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you have?");
		System.out.println("Input number from 1 to 1 billion and press Enter");
		double number = sc.nextDouble();

		String bil = "billion";
		String ml = "million";
		String th = "thousand";
		String hu = "hundred";
		String text = "";

		String[] toten = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] ten = new String[] { "ten", "eleven", "twelwe", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen", };
		String[] afterten = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		int numtopoint = (int) number;
		int numafterpoint = (int) ((number) * 100) % 100;
		int num=numtopoint;

		int a1 = num % 10;
		int a2 = num % 10;
		int a3 = num / 10;
		int b1 = num / 100;
		int c1 = num / 1000;
		int c2 = num / 1000;
		int c3 = num / 100_000;
		int d1 = num / 1_000_000;
		int d2 = num / 1_000_000;
		int d3 = num / 100_000_000;
		int e1 = num / 1_000_000_000;

		// billion
		if (numtopoint % 1_000_000_000 == 0) {
			text += toten[e1] + " " + bil;
			//numtopoint%=100_000_000;
		} else {
			
			// million
			if (numtopoint / 1_000_000 > 0) {
				if (numtopoint > 99_999_999 && numtopoint <= 999_999_999) {
					text += toten[d3] + " " + hu+" ";
					//numtopoint%=100000000;
				}else  if (numtopoint > 9_999_999 && numtopoint <= 99_999_999) {
					text += afterten[d2 / 10] + " ";
					//numtopoint%=10000000;
				}else  if (numtopoint > 999_999 && numtopoint <= 9_999_999) {
					text += toten[d1] + " ";
					//numtopoint%=1000000;
				}
				text += ml;
			}else

			// thousands
			if (numtopoint / 1_000 > 0) {
				if (numtopoint > 99_999 && numtopoint <= 999_999) {
					text += toten[c3] + " " + hu+" ";
					//numtopoint%=100000;
				}else  if (numtopoint > 9_999 && numtopoint <= 99_999) {
					text += ten[c2 % 1000-10] + " ";
					//numtopoint%=10000;
				}else  if (numtopoint > 999 && numtopoint <= 9_999) {
					text += toten[c1] + " ";
					//numtopoint%=1000;
				}
				text += th;
			}else

			// hundred
			if (numtopoint / 100 > 0) {
				if (numtopoint > 99 && numtopoint <= 999) {
					text += toten[b1] + " ";
					//numtopoint%=100;
				}
				text += hu;
			}else
				
			// ten
			if (numtopoint / 10 > 0) {
				if (numtopoint > 19 && numtopoint <= 99) {
					text += afterten[a3] + " ";
					//numtopoint%=10;
				} else if (numtopoint > 9 && numtopoint <= 20) {
					text += ten[a2] + " ";
				}
			}

			if (numtopoint > 0 && numtopoint <= 9) {
				text += toten[a1];
			}
		}
		System.out.println(text+" dollars");

	}
}
