package com.bridgeLabz.boosterbootcampjavaprogram.Day5;

import java.io.*;

public class Slope {
	static void cool_line(int x1, int y1, int x2,
            int y2, int x3, int y3)
{
    if ((y3 - y2) * (x2 - x1) ==
        (y2 - y1) * (x3 - x2))
        System.out.println("true");
    else
        System.out.println("false");
}
 
  
    public static void main (String[] args) {
        int a1 = 2, a2 = 4, 
        b1 = 4, b2 = 6, 
        c1 = 6, c2 = 8;
       cool_line(a1, b1, c1, a2, b2, c2);
         
         
    }
}
