package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FifthTask {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Input text(Space is word separator) and press Enter");
String text = sc.nextLine();
System.out.println(CountWord(text));
sc.close();
	}
	static int CountWord (String text){
		int amount = 0;
		
		char [] elements = text.toCharArray();
		
		for (char el : elements) {
			if(el == ' '){
				amount+=1;
			}
		}
		
		return amount+1;
	}

}
