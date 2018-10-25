package com.gmail.mmalyshmmm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		File file = new File("Array.txt");
		Scanner sc  = new Scanner(System.in);
		System.out.println("Input width of array and press Enter ");
		int n = sc.nextInt();
		System.out.println("Input height of array and press Enter ");
		int m = sc.nextInt();
		
		int[][] array = new int [n][m];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) (Math.random() * 40);
			}
		}
		for (int[] row : array) {
			System.out.println(Arrays.toString(row)+"  ");
		}
		String text = fromArraysToString(array);
		saveTextToFile(text, file);

	}
	public static void saveTextToFile(String text, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static String fromArraysToString(int[][] array) {
		StringBuilder sb = new StringBuilder();
		for (int[] rows : array) {
			for (int cols : rows) {
				sb.append(String.format("%-4.4s\t", "" + cols));
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	

}
