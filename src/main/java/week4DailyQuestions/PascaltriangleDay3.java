/*
Daily Questions:
----------------
1. How do you run the failed testcases using TestNG 
Steps
------
a. If your test cases are failing then once all test suite completed then you have to refresh your 
   project . Right click on project > Click on refresh or Select project and press f5.
b. Check test-output folder, at last, you will get testng-failed.xml
c. Now simply run testng-failed.xml.

2. A class has 4 methods a, b,c,d. Method b depends on Method c, Method c depends on Method a. 
   What will be the order of execution.
   The order is:
   a, d, c, b
   
   Coding Challenge #19
   Write a pascal triangle for rows 5.
1  
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 

Pseudo Code:
------------
1. rows=5 //assign no. of rows
2. for i=0 to 5;i++{
3. num=1; //initialize num=1
4. for j=0 to i;j++ {
5. Print num; //will always '1'
5. num=num x (i-j)/ (j+1)}
6. sysout //to go next line
7. }   
 */
package week4DailyQuestions;

public class PascaltriangleDay3 {

	public static void main(String[] args) {
		int rows = 5;

	    for(int i =0;i<rows;i++) {
	        int num = 1;
	        System.out.format("%"+(rows-i)*2+"s","");
	        for(int j=0;j<=i;j++) {
	             System.out.format("%4d",num);
	             num = num * (i - j) / (j + 1);
	        }
	        System.out.println();
	    }

	}

}
