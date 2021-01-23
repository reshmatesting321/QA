/*
Daily Questions:
-----------------
1. Explain Grid, can a single system act as both hub and node?
Selenium-Grid allows you run your tests on different machines against different browsers in parallel. That is, 
running multiple tests at the same time against different machines running different browsers and operating 
systems. Essentially, Selenium-Grid support distributed test execution. It allows for running your tests in a 
distributed test execution environment. This done by registering various machines, with different browsers 
installed, regiestered as a Node against one Hub.
Yes. We can make the same machine act as a Node and as well as a Hub.

2. How do u change your web driver to run in remote machines?
We need to create the webdriver object using the remotewebdriver class with argments URL(which contains 
Hub ip address and port number and the desired capabilities to run the test cases) like below.

	new RemoteWebDriver(new URL("http://<ipaddress:portnumber>/wd/hub"), dc);
	
Coding Challenge #30:
---------------------
Write a Java program to find out whether a number is a perfect number or not. 
Any number can be a Perfect Number, If the sum of its positive divisors excluding the number itself is 
equal to that number. For example, 28 is a perfect number because 28 is divisible by 1, 2, 4, 7, 14 and 28 
and the sum of these values are: 1 + 2 + 4 + 7 + 14 = 28 (Remember, we have to exclude the number itself. 
That’s why we haven’t added 28 here). Some of the perfect numbers are 6, 28, 496, 8128 and 33550336 so on.

Ex: 28 is a perfect number.
1+2+4+7+14=28 or (1+2+4+7+14+28)/2=56/2=28
 */
package week6DailyQuestions;

import java.util.Scanner;

public class PerfectNumberDay3 {
private static Scanner sc;
	
	public static void main(String[] args) {
		int i, Number, Sum = 0 ;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
 
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}
	}
}
