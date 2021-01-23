package week6ClassQuestions;

import java.util.Scanner;

public class StrinagReverseSatuday1 {

	public static void main(String[] args) {
		 // Reverse String
		String input="WELCOME TO TESTLEAF", reverse = "";
		// String without whitespace
		int j;
	      char[] strArray = input.toCharArray();
	      StringBuffer sb =  new StringBuffer();
	      System.out.println("Enter a string to varify palindrome");
	   
	 
	      int length = input.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + input.charAt(i);
	      System.out.println("The reversed String: "+ reverse);
	      
	     
  
	      for(j = 0; j<strArray.length; j++)
	      {
	          if(strArray[j]!= ' ' && strArray[j]!= '\t')
	          {
	              sb.append(strArray[j]);
	          }
	      }
	      System.out.println(sb);

	    	  
	      }

	}


