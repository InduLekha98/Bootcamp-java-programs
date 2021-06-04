package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class FlipCoin {
	
		

public static String sideUp;
	    public static int number;

	      public void run()
	    {
	        try( Scanner input = new Scanner(in) ) 
	        {
	            out.print("Enter how many times you would like to flip the coin");
	            out.print("if you enter 0 the program quits");
	            int number = input.nextInt();    
	        }
	    }

	      private static void Flipcoin() 
	      {
	          Random rand = new Random();
	          int sideup = rand.nextInt(2);
	          if (sideup == 0) 
	          {
	              sideUp = "heads";
	          } 
	          else 
	          {
	              sideUp = "tails";
	          }
	      }
	      
	      private static void coin() 
	      {
	          Random rand = new Random();
	          int sideup = rand.nextInt(2);
	          if (sideup == 0) 
	          {
	              sideUp = "heads";
	          } 
	          else 
	          {
	              sideUp = "tails";
	          }
	      }
	          public static void main(String[] args)
	          {
	        	  
	        	  if (Math.random() < 0.5){
	        			System.out.println("Heads");
	        			}else{
	        			System.out.println("Tails");
	        			}
	        	  
	              int hcount = 0;
	              int tcount = 0;
	              for (int i = 1; i <= number; i++) 
	              {
	                 coin();
	                  if (sideUp=="heads") 
	                  {
	                      hcount++;
	                  } 
	                  else 
	                  {
	                      tcount++;
	                  }
	              }
	              out.println("total heads = " + hcount + " total tails = " + tcount);
	          
	      }

}
