package com.gmail.mmalyshmmm;

public class FourthTask {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 7, 4 };
		int element = -3;
		System.out.println(SearchElement(array, element));

	}

	static int SearchElement(int[] arr, int element) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==element){
				index = i;
			}
		}

		return index;
	}

}
