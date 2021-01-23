/*
Daily Questions:
1. Given that u have 250 test cases but u dont want to run 150 test cases unless the other 100 is 
successful. How do u achieve them in TestNG.
Make first 100 test cases as a single group [example: @test(groups={"smoke"})], then make next  150 
test cases another group [example: : @test(groups={"sanity"})] and also make it depends on previous 
group (example: [@test(groups="sanity", dependsongroups ="smoke")].
This will force testcases 101 - 250 to run only after first 100 test cases run successfully.
We can go for 
2. Is it possible to run test cases in dataprovider in parallel for each test data given?if, yes how to
do that? if not, why it cant be done?
Data providers can run in parallel with the attribute parallel:

@dataprovider(parallel = true)


Parallel data providers running from an xml file share the same pool of threads, which has a size of
 10 by default. 

You can modify this value in the <suite> tag of your xml file:

<suite name="suite1" data-provider-thread-count="20" >


If you want to run a few specific data providers in a different thread pool, you need to run them 
from a different xml file.

Coding Challenge #20:
---------------------
Pseudo Code:
-------------
1. Get the input, num1=5627832
2. String s=new Integer(num1).toString() //convert the num1 to string and store in 's'
3. size1=7 //get the size of s
4. while(size1>0)
{
r=num1%10 //assign the digit one by one from 'num1' and it starts from 0th place
ai.add(r) //Store the digit inside an arraylist ai
num1=num1/10 //to assign the number from the next digit place
size1=size1-1 //decrement the size by 1
}
5. Print Collections.sort(ai)
 */
package week4DailyQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class DecendingNumbersDay4 {

	public static void main(String[] args) {
		int num1=5627832,r;
		ArrayList<Integer> ai=new ArrayList<Integer>();
		int size1;
		String s=new Integer(num1).toString();
		size1=s.length();
		while(size1>0)
		{
			r=num1%10;
			ai.add(r);
			num1=num1/10;
			size1=size1-1;
		}
		Collections.sort(ai);
		for(int i:ai)
		{
			System.out.println(i);
		}
		

	}

}
