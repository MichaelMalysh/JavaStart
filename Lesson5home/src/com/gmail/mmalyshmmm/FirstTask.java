package com.gmail.mmalyshmmm;

public class FirstTask {

	public static void main(String[] args) {

		int[] array = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int count = 0;

		for (int i = 0; i < array.length; i += 1) {
			if (array[i] % 2 != 0) {
				count+=1;
			}
		}
		System.out.println("Odd number in array: "+count);

	}

}
