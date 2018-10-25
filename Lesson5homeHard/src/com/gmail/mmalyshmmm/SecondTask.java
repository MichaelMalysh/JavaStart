package com.gmail.mmalyshmmm;

import java.util.Arrays;

public class SecondTask {

	public static void main(String[] args) {
		int[] array = new int[] {1,4,7,0,9,8,4,6,8};
		System.out.println(Arrays.toString(array));
		int tmp=0;
		for (int i = 0; i < array.length/2; i++) {
		tmp = array[array.length-1-i];
		array[array.length-1-i] = array[i];
		array[i] = tmp;
		}
System.out.println(Arrays.toString(array));

	}

}
