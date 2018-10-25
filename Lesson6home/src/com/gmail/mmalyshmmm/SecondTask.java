package com.gmail.mmalyshmmm;

public class SecondTask {

	public static void main(String[] args) {
		String text = "I`m ";
		int whole  = 18;
		double notWhole = 6.8;
		
		System.out.println(Concatanation(whole, text, notWhole));

	}
	static String Concatanation (int number, String text, double fnumber ){
		String fullText = "";
		double sum = number+fnumber;
		fullText= text + sum;
		return fullText;
	}

}
