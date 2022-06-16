package com.epam.leetcode;

import java.util.ArrayList;

public class RemoveElements {
      public static void main(String[] args) {
          ArrayList<Integer> arr = new ArrayList<Integer>(5);  
          
          arr.add(3);  
          arr.add(2);  
          arr.add(2);  
          arr.add(3);  
          System.out.println("The list of the size is: " + arr.size());  
          
          for (Integer name : arr) {  
             System.out.println("Name is: " + name);  
          }    
         
          arr.remove(1);  
          System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
         
          for (Integer name : arr) {  
             System.out.println("Name is: " + name);  
          }  

	}
}
