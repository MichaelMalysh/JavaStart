package com.gmail.mmalyshmmm;

import java.util.Arrays;

public class ThirdTask {

	public static void main(String[] args) {

		int[] array = new int[15];

		for (int i = 0; i < array.length; i += 1) {
			array[i] = (int) (Math.random() * 20);
		}
		System.out.println("\t\tOld Array");
		System.out.println(Arrays.toString(array));

		int[] arrayTwo = Arrays.copyOf(array, (30));

		for (int i = 0; i < arrayTwo.length; i += 1) {
			if(i>14){
			arrayTwo[i] = arrayTwo[i-15]*2;
			}
		}
		System.out.println();
		System.out.println("\t\tNew Array");
		System.out.println(Arrays.toString(arrayTwo));

	}

}
