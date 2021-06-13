package com.bridgeLabz.boosterbootcampjavaprogram.Day5;

public class squareRoot {
	static double squareRoot(double c, double epsilon) 
    { 
         
        double x = c; 
      
         
        double root; 
      
         
        int count = 0; 
      
        while (true)
        { 
            count++; 
      
            
            root = 0.5 * (x + (c / x)); 
      
             
            if (Math.abs(root - x) < epsilon) 
                break; 
      
             
            x = root; 
        } 
      
        return root; 
    } 
      
     
    public static void main (String[] args) 
    { 
        double c = 123; 
        double epsilon = 0.00001; 
      
        System.out.println(squareRoot(c, epsilon)); 
    } 
}

