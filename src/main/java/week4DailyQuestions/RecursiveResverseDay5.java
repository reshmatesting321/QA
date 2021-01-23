/*
Daily Questions:
---------------
1. What is the difference between ClassNotFoundException and NoClassDefFoundError?
NoClassDefFoundError is a linkage error basically. It occurs when you try and instantiate an 
object (statically with "new") and it's not found when it was during compilation.

ClassNotFoundException is more general and is a runtime exception when you try to use a class that 
doesn't exist. For example, you have a parameter in a function accepts an interface and someone passes 
in a class that implements that interface but you don't have access to the class. It also covers case of 
dynamic class loading, such as using loadClass() or Class.forName().
2. What are the scenarios in which finally block will not be executed at all?
The finally clause in the try-catch exeception block always executes, irrespective of the occurence 
of exeception. This is applicable for the normal java program flow. If the execution flow is stopped 
irreversibly before the finally clause, then the finally block will not be executed.

How can the user achieve that in Java?
Include “System.exit(1);” before the finally block and stop the execution flow of the java program.

Answer From TestLeaf:
---------------------
1) ClassNotFoundException is an exception that occurs when you try to load a class at run time
 using Class.forName() or loadClass() methods and mentioned classes are not found in the 
 classpath.

 NoClassDefFoundError is an error that is thrown when the Java Runtime System tries to load 
 the definition of a class, and that class definition is no longer available
 NoClassDefFoundError is an error that occurs when a particular class is present at 
 compile time, but was missing at run time.




2) In a Java try{} ... catch{} ... finally{} block, code within the finally{} is 
generally considered "guaranteed" to run regardless of what occurs in the try/catch. 
However, there are three circumstances under which it will not execute:

i) If System.exit(0) is called
ii) A JVM Crash, will also prevent finally being called.
i.e. the JVM stops immediately at this point and produces a crash report.
iii) An infinite loop in try or catch would also prevent a finally being called.
iv) if the current thread is interrupted or killed.
Coding Challenge #21:
---------------------
Write a program in java to reverse a string and a number using recursive functions?
public class Code_21 {

	public static void main(String[] args) {
		String text = "Welcome to Test Leaf";
		int number = -123489;
		System.out.println(recursiveReverse(text));
		if (number > 0) {
			recursiveReverse(number);
		} else if (number < 0) {
			System.out.print("-");
			recursiveReverse(number*-1);
		} else {
			System.out.print(0);
		}
	}

	private static void recursiveReverse(int number) {
		if (number != 0){
			System.out.print(number%10);
			recursiveReverse(number/10);
		}
	}

	private static String recursiveReverse(String text) {
		if (text != null && text.length() == 1){
			return text;
		} else {
			return recursiveReverse(text.substring(1))+text.charAt(0);
		}
	}
}
Pseudo Code:
------------

 */
package week4DailyQuestions;

import java.util.Scanner;

public class RecursiveResverseDay5 {
	public String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	public void reversenum(int rn)
	{
		if (rn < 10) {
			System.out.println(rn);
			   
		       }
		       else {
		    	   System.out.print(rn % 10);
		           //Method is calling itself: recursion
		           reversenum(rn/10);
		           
		       }
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RecursiveResverseDay5 rs=new RecursiveResverseDay5();
		// TO Reverse a String:
		System.out.println("Ener the string to be reversed :");
		String s=in.next();
		String str=rs.reverse(s);
		System.out.println("The Reversed String is :"+ str);
		int num=0;
		System.out.println("Input your number and press enter: ");
		num = in.nextInt();
rs.reversenum(num);

	}

}
