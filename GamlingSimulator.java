package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Random;
import java.util.Scanner;

public class GamlingSimulator {
	public static void main(String[] args) {
	         System.out.println("Enter the number of stake");
	         Scanner scan = new Scanner(System.in);
	         int stake = scan.nextInt();
	         System.out.println("Enter your goal");
	         int goal = scan.nextInt();
	         System.out.println("Enter the no of trails or limit");
	         int trail = scan.nextInt();
	         int random;
	         int win =0;
	         int lose =0;
	         boolean loop = true;
	         while(loop) {
	        	 Random r = new Random();
	        	 random = r.nextInt(2);
	        	 if(random == 1)
	        	 {
	        		 win++;
	        		 System.out.println("placed a bet and won");
	        		 stake++;
	        		 if(stake == goal) {
	        			 System.out.println("congrats you have won");
	        			 loop = false;
	        		 }
	        	 }
	        	 else
	        	 {
	        		 lose ++;
	        		 System.out.println("plaved a bet and lost");
	        		 stake--;
	        		 if (stake == trail)
	        		 {
	        			 System.out.println("Sorry you lost");
	        			 loop =false;
	        		 }
	        		 }
	        		 
	        	 }
	    
	         

	}
	
}
	         
	         
