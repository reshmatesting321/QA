/*
 Daily Questions:
 ----------------
1.Why should you use page object model framework(FW)? and what are the advantage to compare with other FW?
 Page Object Model Framework is used for easy maintenance and reusability of code.
In POM we have separate class for every page and in each test case we just need to call the 
class and it functions.
Advantages when compared to other framework:-
Now, if there are any code changes, or locator changes for any element of the page,
We just need to change only the code once (within the page objects).
And changes will reflect in other pages as well.

2. How is data Provider is useful for your framework? 
 Data Provider is used to provide the dynamic data input to the tests.
In our framework, it is also used to read the data from the excel sheet.
 Coding Challenge #23
 ---------------------
 Write a java program to convert a string in lowercase to uppercase without using string functions?
 
 */
package week5DailyQuestions;

import java.util.Scanner;

public class StringUpperCaseDay2 {

	private static Scanner sc;
	public static void main(String[] args) {
		String newStr = "";
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Lowercase text: ");
		String a= sc.nextLine();
		
	    for (int i = 0; i< a.length(); i++){
	        char aChar = a.charAt(i);
	        if (92 <= aChar && aChar <=122){
	            aChar = (char)( (aChar - 32) ); 
	        }
	        newStr = newStr + aChar;    
	    }
	    System.out.println(newStr);
	}

}
