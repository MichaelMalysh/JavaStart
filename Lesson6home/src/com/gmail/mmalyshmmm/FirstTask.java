package com.gmail.mmalyshmmm;

public class FirstTask {

	public static void main(String[] args) {

		int[] array = new int[] {-3,-2,1 };
		int max = maxValue(array);
		System.out.println("Max value is " + max);
	}

	static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
