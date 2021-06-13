package com.bridgeLabz.boosterbootcampjavaprogram.Day5;

import java.util.Scanner;

public class MoneyFutureValue {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in); 
	    System.out.print("Input the investment amount: ");
	 	double C = in.nextDouble();
	 	System.out.print("Input the rate of interest: ");
		double r = in.nextDouble();
		System.out.print("Input number of years: ");
		int T = in.nextInt();
		
		r *= 0.01;
		
		System.out.println("Years    FutureValue");
		for(int i = 1; i <= T; i++) {
	    	int formatter = 19;
		    if (i >= 10) formatter = 18;
			System.out.printf(i + "%"+formatter+".2f\n", futureInvestmentValue(C, r/12, i));
	       }
		 }
	 
	 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
			return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
		}
	}
