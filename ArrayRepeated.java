package com.bridgeLabz.boosterbootcampjavaprogram.Day3;

import java.lang.Math.*;
public class ArrayRepeated {
	

    static int findRepeating(int arr[], int n)
    {
        int missingElement = 0;
      
        
        for (int i = 0; i < n; i++){
      
            int element = arr[Math.abs(arr[i])];
      
            if(element < 0){
                missingElement = arr[i];
                break;
            }
          
        arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
    }
      
    return Math.abs(missingElement);
      
    }
      
    
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5,
                    6, 1, 7, 8, 5};
      
        int n = arr.length;
      
        System.out.println(findRepeating(arr, n));
      
    }
}
