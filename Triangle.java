package com.bridgeLabz.boosterbootcampjavaprogram.Day5;

public class Triangle {

	static void collinear(int x1, int y1, int x2,
            int y2, int x3, int y3)
{


int a = x1 * (y2 - y3) +
  x2 * (y3 - y1) +
  x3 * (y1 - y2);

if (a == 0)
System.out.println("true");
else
System.out.println("false");
}


public static void main(String args[])
{
int x1 = 2, x2 = 4, x3 = 6,
y1 = 4, y2 = 6, y3 = 8;
               
collinear(x1, y1, x2, y2, x3, y3);

}
}
