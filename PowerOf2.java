package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {

		

		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n here : ");
		n = sc.nextInt();

		int i = 0; 

		int powerOfTwo = 1; 

		

		while (i <= n) {

		System.out.println(i + " " + powerOfTwo); 

		powerOfTwo = 2 * powerOfTwo; 

		i = i + 1;

		}

		}

		}
