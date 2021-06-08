package com.bridgeLabz.boosterbootcampjavaprogram.Day3;

import java.io.*;

public class Binary {
	static void decToBinary(int n)
    {
        
        int[] binaryNum = new int[10];
 
        
        int i = 0;
        while (n > 0) {
            
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
      
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
 
	static int swapNibbles(int x)
	{
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	    
	    
	}
    
    public static void main(String[] args)
    {
        int n = 9;
        decToBinary(n);
        int x = 100;
	    System.out.print("	"+swapNibbles(x));
	    
    }
}
