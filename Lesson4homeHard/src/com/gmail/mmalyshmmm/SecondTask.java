package com.gmail.mmalyshmmm;

public class SecondTask {

	public static void main(String[] args) {
		boolean prime = false;
		System.out.println("\tPrimes: ");
		for (int i = 2; i <= 100; i += 1) {
			if(i==2){
				prime = true;
			}else if (i % 2 == 0) {
				continue;
			}
			for (int j = 2; j < i; j += 1) {
				if (i % j != 0) {
					prime = true;
				} else {
					prime = false;
					break;
					
				}
			}
			if (prime==true) {
				System.out.print(i+" ");	
			}
		}

	}

}
