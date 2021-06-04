package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DayOfWeek {
	 public static void main(String[] args) {
		
			SimpleDateFormat sdf = new SimpleDateFormat("EEE");
			String stringDate = sdf.format(new Date());
			System.out.println("Today is: "+stringDate);
				
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
			String stringDate2 = sdf2.format(new Date());
			System.out.println("Today is: "+stringDate2);
		   }

}
