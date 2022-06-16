package com.epam.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
   public static void main(String[] args) {
	int ar[] = {1,1,2,2,3,4,5,6,6,7};
	Arrays.sort(ar);
	int result[] = new int [ar.length];
	int k =0;
	for (int i = 0; i < ar.length-1; i++) {
		if (ar[i]!= ar[i+1]) 
			result[k++] = ar[i];
			
		}
	result[k++] = ar[ar.length-1];
	for (int i = 0; i < k; i++) {
		System.out.println(" " + result[i]);
	}
		
	}
	
	
	
}

