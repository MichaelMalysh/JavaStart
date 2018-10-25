package com.gmail.mmalyshmmm;

import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input lenghth: ");
		int a = sc.nextInt();
		int b=a-1;
		String zvezdan = "";
		String zvezdav = "";
		

		for (int i = 0; i < a+b; i++) {
			System.out.print("*");
			if (i>0 && i<a){
				zvezdan+="*";
				System.out.print(zvezdan);
			}
			int c=a;
			if(i==a){
				while (c>2){
					System.out.print("*");
					c--;
				}
			}else if(i+1<a+b && i>a){
				 c=i-(i-3);
				while(c<a){
					System.out.print("*");
					c++;
				}
			}
			System.out.println();
			

			
		}
	}

}
