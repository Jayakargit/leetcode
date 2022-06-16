package com.epam.leetcode;

import java.util.Stack;

public class ValidParentheses {
   static boolean BracketSBalanced(String s) {
	  
	  Stack stack =new Stack();
	  for(int i=0;i<s.length();i++)
	  {
	  char x=s.charAt(i);
	  if(x =='(' || x=='{' || x=='[')
	  {
	  stack.push(x);
	  continue;
	  }
	  if(stack.isEmpty())
		  return false;
	  char check;
	  switch(x)
	  {
	  case ')':
	  check = (char) stack.pop();
	  if(check=='{' || check == '[')
		  return false;
	  break;
	  case '}':
	  check = (char) stack.pop();
	  if(check=='(' || check == '[')
		  return false;
	  break;
       case ']':
	  check = (char) stack.pop();
	  if(check=='{' || check == '(')
		  return false;
	  break; }
	  }
	  return (stack.isEmpty());
	  }
	  public static void main(String[] args) {
	 System.out.println(BracketSBalanced("[]"));
	  
	    
  }
}
