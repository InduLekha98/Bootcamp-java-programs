package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Scanner;

public class CarLoan {
	public static void main(String[] args) {
        double principal;
        double years;
        double rate ;
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter an principal here : ");
    	principal = sc.nextDouble();
    	System.out.println("Enter an years here : ");
    	years = sc.nextDouble();
    	System.out.println("Enter an rate here : ");
    	rate = sc.nextDouble();

        double r = (rate / 100) / 12;   
        double n = 12 * years;         

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }

}
