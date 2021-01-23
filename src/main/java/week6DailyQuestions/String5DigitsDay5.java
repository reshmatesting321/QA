/*
Daily Questions:
----------------
1. How can you execute a single test case in two platforms at the same time?
2. How can you achieve mouse hover actions using Actions Class?

Coding Challenge #32:
---------------------
Write a Java program to to verify the given string has exactly 5 digits in it.
Input="12345" Input1="123456" Input2="123.45"
Output=true   Output1=false   Output2=false 
 */
package week6DailyQuestions;

public class String5DigitsDay5 {

	public static void main(String[] args) {
		String[] s=new String[]{"12345","123456","123.45"};
		for(int i=0;i<3;i++)
		{
			if(s[i].length()==5)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		//s={"12345","123456","123.45"};
		

	}

}
