package com.epam.leetcode;

public class ImplementStr {
	 public static int strStr(String haystack, String needle) {
	        
	        if (needle.isEmpty())
	        	return 0;
	        if (!haystack.contains(needle))
	        	return -1;
	        int index = 0;
	        int len = needle.length();
	        
	        for (int i = 0; i <= haystack.length() - len; i++) {
	            if (haystack.substring(i, i + len).equals(needle)) {
	                index = i;
	                break;
	            }
	        }
	        return index;
	    }
	 public static void main(String[] args) {
		String haystack  = "hello";
		String needle = "ll";
		System.out.println("Implement strStr: "+strStr(haystack,needle));
	}
	}


