package com.bridgeLabz.boosterbootcampjavaprogram.Day2;

import java.util.*;

public class Trig {
	
    public static void main(String args[])
    {
  
        double degrees = 45.0;
  
        
        double radians = Math.toRadians(degrees);
  
        
        double sinValue = Math.sin(radians);
  
        double cosValue = Math.cos(radians);
        
        System.out.println("sin(" + degrees + ") = " + sinValue);
        
        System.out.println("cos(" + degrees + ") = " + cosValue);
    }
}
