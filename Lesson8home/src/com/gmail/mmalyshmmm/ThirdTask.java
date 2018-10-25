package com.gmail.mmalyshmmm;

import java.io.File;
import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select directory and press Enter");
		String direcrory = sc.nextLine();
		File folders = new File (direcrory+":\\");
		folderView(folders);

	}
	
	public static String folderView (File folders){
		String nameFold = "";
		File[] foldersList = folders.listFiles();
  
		
		for (File file : foldersList) {
			if(file.isDirectory()){
				System.out.println(file.isDirectory() ? file + " -- Folder" : " ");
			}
		}

		
		return nameFold;
	}

}
