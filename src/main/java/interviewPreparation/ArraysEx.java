package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


public class ArraysEx {

	public static void main(String[] args) {
		/*
		 * 
		
	//Array filling
		int array[] = new int[6];
		 
		Arrays.fill(array, 100); //fills array with 100 for 6 elements
		 
		for (int i = 0, n = array.length; i < n; i++) {
		 
		System.out.println(array[i]);
		 
		}
		 
		System.out.println();
		 
		Arrays.fill(array, 3, 6, 50); //fill 50 from 3rd index to 6th index
		 
		for (int i = 0, n = array.length; i< n; i++) {
		 
		System.out.println(array[i]);}}
		*/
		/*
		//Removing a number from array
		int[] testArr = new int[] { 10, 102, 13, 14, 105};
		 
		System.out.println("Array size : " + testArr.length );
		System.out.println("Find Contents : " + Arrays.toString(testArr));
		//let's remove or delete an element from Array using Apache Commons ArrayUtils
		 
		testArr = ArrayUtils.remove(testArr, 2); //removing element at index 2
		 
		//Size of array must be 1 less than original array after deleting an element
		 
		System.out.println("Size of array after removing : " + testArr.length);
		 
		System.out.println("Content of Array : "+ Arrays.toString(testArr));
		 
		} 
		*/
		/*
		//Reverse Array: or Descending order logic:
		String[] s = new String[]{"My","Leg","is","cut"};
		 
		for(int i=s.length-1; i>=0; i--){
		 
		System.out.println(s[i]);}}
		*/
		/*
		//Sum of arrays:
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
		int sum = 0;
		 
		for (int i: my_array)
		 
		sum += i;
		 
		System.out.println("The sum is " + sum);
		 
		}
		*/
		/*
		//Write a program to insert an element and in the specific position in the array
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 
		int Index_position = 2;
		 
		int newValue = 5;
		 
		System.out.println("Original Array : "+Arrays.toString(my_array));
		 
		for(int i=my_array.length-1; i > Index_position; i--){
		 
		my_array[i] = my_array[i-1];
		}my_array[Index_position] = newValue;
		 
		System.out.println("New Array: "+Arrays.toString(my_array));
		 
		}
		*/
		/*
		//Findout missing numbers:
		 
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a[] = { 1,3,4,5,6,7,10 };
		int j = a[0];
		System.out.println(a.length);
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		    j++;
		    }
		}
		System.out.println("missing numbers are ");
		for(int r : arr)
		{
		    System.out.println(" " + r);
		}
		*/
		/*
		//find out missing number
		 int a[] = {1,2,3,5,6};
	        int i, total;
	        total  = (5+1)*(5+2)/2;   
	        for ( i = 0; i< 5; i++)
	           total -= a[i];

	        System.out.println(total);       
	  */
		/*
		 * Duplicate elements is present in array or not:
		 * public static void main(String[] args) {
 
String[] strArray1 = {"abc1", "def1", "mno1", "xyz1", "pqr1", "xyz1", "def1"};
 
for (int i = 0; i < strArray1.length-1; i++) {
 
for (int j = i+1; j < strArray1.length; j++) {
 
if( (strArray1[i].equals(strArray1[j])) && (i != j) ) {
 
System.out.println("Duplicates : "+strArray1[j]);
 
}}}} */
//-------------------------------------------------------
/* 
 //Iterating Array:
  * public static void main(String[] args)
 
{
 
int[] a1 = new int[]{45, 12, 78, 34, 89, 21};
 
//Iterating over an array using normal for loop
 
for (int i = 0; i < a1.length; i++)
 
{
 
System.out.println(a1[i]);
 
}}
	 */
//------------------------------------------
 /*
  //Iterating array elements using For each/extended for loop:
  public static void main(String[] args)
 
{
 
int[] a1 = new int[]{45, 12, 78, 34, 89, 21};
 
//Iterating over an array using normal for loop
 
for (int i = 0; i < a1.length; i++)
 
{
 
System.out.println(a1[i]);
 
}}
int[] a2 = new int[]{45, 12, 78, 34, 89, 21};
 
//Iterating over an array using extended for loop
 
for (int i: a2){
 
System.out.println(i);}

  */
		//----------------------------------------------
		/*
		 //missing element in array from 1-100
		  
		 */
	

	}
}

