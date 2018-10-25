package com.gmail.mmalyshmmm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstTask {

	public static void main(String[] args) {
		Calendar mt  = Calendar.getInstance();
		Calendar lt  = Calendar.getInstance();
		
		int month = lt.get(Calendar.MONTH);
		Date dateOne = mt.getTime();
		
		month--;
		lt.set(Calendar.MONTH, month);
		Date dateTwo = lt.getTime();
		
		
		SimpleDateFormat sdfOne = new SimpleDateFormat("yyyy MMMM dd");
		String resOne = sdfOne.format(dateOne);
		SimpleDateFormat sdTwo = new SimpleDateFormat("yyyy MMMM dd");
		String resTwo = sdfOne.format(dateTwo);
		
		System.out.println(resOne);
		System.out.println(resTwo);
		System.out.println(dateOne.getTime() - dateTwo.getTime());
		

	}

}
