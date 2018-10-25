package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FourthTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sting: ");
		String text = sc.nextLine();

		char[] arr = text.toCharArray();
		int count = 0;
		for (int i=0;i<arr.length; i+=1){
			if(arr[i]=='b'){
				count+=1;
			}
		}
		System.out.println("Characters b in your string: "+count);

	}

}
