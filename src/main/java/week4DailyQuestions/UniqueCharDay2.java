/*
Daily Questions:
1. List some annotations and attribute in TestNG
Annotation	Description
@BeforeSuite	The annotated method will be run only once before all tests in this suite have run.
@AfterSuite	The annotated method will be run only once after all tests in this suite have run.
@BeforeClass	The annotated method will be run only once before the first test method in the current class is invoked.
@AfterClass	The annotated method will be run only once after all the test methods in the current class have been run.
@BeforeTest	The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest	The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
@BeforeGroups	The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups	The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeMethod	The annotated method will be run before each test method.
@AfterMethod	The annotated method will be run after each test method.
@DataProvider	Marks a method as supplying data for a test method. The annotated method must return an Object[][] where each Object[] can be assigned the parameter list of the test method. The @Test method that wants to receive data from this DataProvider needs to use a dataProvider name equals to the name of this annotation.
@Factory	Marks a method as a factory that returns objects that will be used by TestNG as Test classes. The method must return Object[].
@Listeners	Defines listeners on a test class.
@Parameters	Describes how to pass parameters to a @Test method.
@Test	Marks a class or a method as part of the test.

Attributes:
------------
Attribute	Description
name	The name of this suite. It is a mandatory attribute.
verbose	The level or verbosity for this run.
parallel	Whether TestNG should run different threads to run this suite.
thread-count	The number of threads to use,if parallel mode is enabled (ignored other-wise).
annotations	The type of annotations you are using in your tests.
time-out	The default timeout that will be used on all the test methods found in this test.

------------------------------------------------------------------------------------------------------
2. Difference between Parameters and DataProvider
With @Parameters, the parameter values you provide are hardcoded in the test configuration file,
 testng.xml. Also, as far as I can recall, there is no way to specify the execution of the same test 
 with varying values for a parameter. You provide one value for each parameter and that's it.

With @DataProvider, you provide a method that will generate the parameter values. They do not need to 
be hardcoded anywhere: you can compute them on the fly. For instance, you could fetch the current 
temperature from a website and use the resulting value as a parameter value. Or your could read them 
from a CSV file.

Also, you can provide multiple sets of values for the parameters. That way, you can run the same test 
multiple times with each combination of parameter values you want.

Coding Challenge #18:
---------------------
Write a java program to identify and form a unique string.
Ex: Good -->God

Pseudo Code:
------------
1. Get the string and store in 'str'
2. Initialize a string, str1 to blank
3. Get the size of ,'str' and store it in size1
4. for(i=0;i<size1;i++)
{
if(str1!=str.charAt(i)
{
str1=str1+str.charAt(i)
}
}
5. Print str1
 */
package week4DailyQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueCharDay2 {

	public static void main(String[] args) {
		String str, str1="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		str=s.next();
		int size1=str.length();
		for(int i=0;i<size1;i++)
		{
			if(!str1.contains(String.valueOf(str.charAt(i))))
			{
				str1+=str.charAt(i);
			}

		}
		System.out.println("The Unique Charecters are " + str1);

	}

}
