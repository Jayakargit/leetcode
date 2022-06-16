package com.epam.leetcode;

public class LongestCommonPerfix {
	
	public static String longestCommonPrefix(String[] strs) {
	System.out.println("Given Names :"+strs);
	if (strs.length == 0)
		return "";
	String prefix = strs[0];
	for (int i = 1; i < strs.length; i++)
	while (strs[i].indexOf(prefix) != 0) {
	prefix = prefix.substring(0, prefix.length() - 1);
	if (prefix.isEmpty())
		return "";
	}
	return prefix;
	}
   public static void main(String[] args) {
	   LongestCommonPerfix lp = new LongestCommonPerfix();
	String[] strs = {"flowers","flow","flight"};
	System.out.println("LongestCommonPrefix is: "+lp.longestCommonPrefix(strs));
			
}

}
