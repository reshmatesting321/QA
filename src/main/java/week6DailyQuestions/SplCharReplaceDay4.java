/*
Daily Questions:
----------------
1. How will you take snapshot with Selenium Grid?
2. Suppose there are 2 testcases to be executed in different sessions is that possible? How it possible?

Coding Challenge #31:
---------------------
Write a Java program to replace the special characters in the given string.
Input="{Java}/\\*(Selenium)"
OutPut=Java Selenium
 */
package week6DailyQuestions;

public class SplCharReplaceDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="{Java}/\\*( Selenium)";
System.out.println(s.replaceAll("[^a-zA-Z0-9]+"," "));
	}

}
