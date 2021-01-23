/*
 Daily Questions:
 -----------------
 1. What type of Reporting tool u use? and y do u choose it?
 --HTML Extent Reports is the reporting tool used by us.
--Extent Reports is used for the below reasons:
--It can produce reports for huge number of test cases
--Can generate Online and Offline reports
--The status can be represented as pie charts
--Existing reports can be replaced or new reports can be appended to 

the existing reports
--Can generate the step wise information in the report
--Can show the screenshots for each step of the test case
--Can segregate the tests using Test Categories

 2. Explain the following.
   a) ExtentReports
   b) ExtentTest
 ExtentReports:_
--ExtentRports is used for initialising the Extent HTML reports
--There are 6 types to pass the arguments to ExtentReports
--Filepath
--Filepath, replaceExisting
--Filepath, replaceExisting, displayOrder
--Filepath, replaceExisting, displayOrder, Network mode
--Filepath, replaceExisting, Network mode
--Filepath, Network mode

 ExtentTest
--defines a node in the report file
--We use the method startTest of ExtentTest to log all the test events in the HTML report
  
 Coding Challenge #26:
 ---------------------
 Write a java program to get 3 individual single digit numbers from the user and 
 print all the possible combinations of the numbers
 Ex: I/P=1,2,3
 O/P=123,213,321,312,132
 */
package week5DailyQuestions;

import java.util.Scanner;

public class DigitComboDay4 {


	private static Scanner sc;

	public static void main(String[] args) {
		/*Write a Java program to get 3 digit number from the user and print all the possible combinations of the numbers with the digits present.
		Ex – Input – 123
			  Output – 123 , 132 , 213 , 231 , 312 , 321*/
		int i, number;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		String s = sc.next();
		i=s.length();
		int a[]=new int[i];
		i=0;
		number=Integer.parseInt(s);
		//Dividing the number in to an array
		while(number>0) {
			int temp=number%10;
			a[i]=temp;
			number=number/10;
			i++;
		}
		permute(0, a);
	}
	public  static void permute(int start, int[] input ) {
		if (start == input.length) {
			for(int x: input){
				System.out.print(x);
			}
			System.out.println("");
			return;
		}
		for (int i = start; i < input.length; i++) {
			int temp = input[i];
			input[i] = input[start];
			input[start] = temp;

			permute(start + 1, input);

			temp = input[i];
			input[i] = input[start];
			input[start] = temp;
		}
	}
}
