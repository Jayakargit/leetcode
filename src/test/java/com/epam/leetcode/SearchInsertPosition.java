package com.epam.leetcode;

public class SearchInsertPosition {
    public static int SearchInsertPosition(int[] nums,int target) {
    	
    	int n = nums.length;
    	for (int i = 0; i < n; i++) {
			if(nums[i]>=target)
				return i;
				
		}
		return n;	
    }
    public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		System.out.println("searchinsert:" + SearchInsertPosition(nums,2));
	}
}
