package com.gmail.mmalyshmmm;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FirstTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("sometext.txt");
		try{
			file.createNewFile();
		}catch (IOException e){
			System.out.println(e);
		}
		System.out.println(file.exists() ? "File is exist" : "file is not exist");
		
		System.out.println("Enter the text to save in file");
		String text = sc.nextLine();
		System.out.println(text);
		saveTextToFile(text, file);

		sc.close();
	}
	
	public static void saveTextToFile(String text, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
	

}
