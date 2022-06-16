package com.epam.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	 public static  int[] twoSum(int[] num, int target) {
		 Map<Integer,Integer> mp = new HashMap<>();
	        for(int i = 0; i < num.length; i++){
	        	mp.put(num[i], i);
	        }
	           for (int i = 0; i < num.length; i++) {
				int numToFind = target - num[i];
				if (mp.containsKey(numToFind) && mp.get(numToFind) != i) {
					return new int[] {i, mp.get(numToFind)};
				}
			}
	        return null;
	 }
	 public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target1 = 18;
		
		System.out.println("two sum" +Arrays.toString(twoSum(nums,target1)));
	
	}
   
	 }
	 
	