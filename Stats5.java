package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Scanner;

public class Stats5 {
	public static void main(String [] args)
    {
		 Scanner scan = new Scanner(System.in);
	        double average;
	        float  sum = 0.0f, num;
	        int count=0;
	        float min=0.0f, max=1.0f;
	        		
       
        System.out.println("Please enter the number of numbers you wish to evaluate:");

        
        do {
            num = scan.nextFloat();
            sum += num;
            count++;
        } 
        while (count < 5);
        
        average = sum / 5.0d;
        
        {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Your average is: " + average);
        System.out.println("The sum is: " + sum);
        
        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);

     
    }

       }

