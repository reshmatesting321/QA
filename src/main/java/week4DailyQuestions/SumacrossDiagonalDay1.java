/*
Daily Questions:
----------------
1. What is the use of <package> tag in TestNG xml?
In testng.xml file we can specify the specific package name , which needs to be executed.
In a project there may be many packages, but we want to execute only the selected packages.
We need to specify the names of the packages in between the package tags.
Example:
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
 
<suite name="Suite1" verbose="1" >
  <test name="Regression1"   >
    <packages>
      <package name="test.sample" />
   </packages>
 </test>
</suite>
TestNG will look at all the classes in the package test.sample and will retain only classes that have 
TestNG annotations.

2. How to run methods in parallel using TestNG xml from single class file?
The method can be run in paraller using Method groups.You can also exclude or include individual methods:
<suite name="My suite" parallel="methods" thread-count="2">
<test name="Test1">
  <classes>
    <class name="example1.Test1">
      <methods>
        <include name="TestMethod1"/>
        <exclude name="TestMethod2"/>
      </methods>
     </class>
  </classes>
</test>

TestNG will run all your test methods in separate threads. 
Dependent methods will also run in separate threads but they will respect the order that you specified.

Coding Challenge #17:
---------------------
Write a java program to print the numbers which has 
the greatest sum across the diagonal. code must be generic for NxN matrix.

 */
package week4DailyQuestions;

import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class SumacrossDiagonalDay1 {
	public static void main(String[] args) {
		/*Write a simple Java program to print the numbers which has the greatest sum across the diagonal. 
		 * Code must be generic for NxN matrix.
		Ex -  1      2     3     4
			  5      6     7     8
			  9      10    11    12
			  13     14    15    16
		The diagonal is 4,7,10,13.  
		The numbers across the diagonal are 1,2,3,5,6,9 and 8,11,12,14,15,16. 
		Their sum is 22 and 76. So the output should be 8,11,12,14,15,16.*/
		System.out.println("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		int rowCount = scan.nextInt();
		int matrix[][] = new int[rowCount][rowCount];
		int arrSize = ((rowCount*rowCount)-rowCount)/2;
		int upperDiag[] = new int[arrSize];
		int lowerDiag[] = new int[arrSize];
		int upperDiagSum = 0,lowerDiagSum = 0,pos1=0,pos2=rowCount-1,k=0,l=0;
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<rowCount;j++){
				System.out.print("Enter the matrix value for Row-"+(i+1)+" Column-"+(j+1)+":");
				matrix[i][j]=scan.nextInt();
			}
		}
		scan.close();
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<rowCount;j++){
				if(matrix[i][j]!=matrix[pos1][pos2]){
					if(j<pos2){
						upperDiagSum=upperDiagSum+matrix[i][j];
						upperDiag[k]=matrix[i][j];
						k++;
					}
					if(j>pos2){
						lowerDiagSum=lowerDiagSum+matrix[i][j];
						lowerDiag[l]=matrix[i][j];
						l++;
					}
				}
			}
			pos1=pos1+1;
			pos2=pos2-1;
		}
		System.out.println("sum of upper half:"+upperDiagSum);
		System.out.println("sum of lower half:"+lowerDiagSum);
		System.out.print("half which is greater is ");
		if(upperDiagSum>lowerDiagSum){
			System.out.print(ArrayUtils.toString(upperDiag));
		}else{
			System.out.print(ArrayUtils.toString(lowerDiag));
		}
	}
}
