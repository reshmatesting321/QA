/*
Daily Questions:
-----------------
1. Explain the folder structure of your FrameWork? and explain what do you store in each?
--In the Page Object model framework, the folder structure I have is: data, reports, drivers, src.
--data folder contains the excel files with the test data.
--reports folder contains the html reports of the test cases run and the images captured as screenshot 
inside the images folder.
--drivers folder contains the drivers for various browser that are to be tested.
--src folder contains the java source files under the below packages
	--utils package has classes: DataInputProvider & Reporter(Abstract class)
	--wrappers package has: Interface Wrappers, LeafTapsWrappers & GenericWrappers
	--pages contains all the pages of the Leaf taps website
	--testcases folder contains the test cases to Create, Edit, Duplicate, Merge & Delete Lead using 
the Page Object model framework
	
2. Where do you store URL information in your framework and why?
--In our project, the URL info is stored in the config.properties xml file
--We store the URL info in the config file because, in-case if there is a change in the URL or test across 
different servers, rather than changing the code, we can do the modifications at the config level
and it is simple

Coding Challenge #25:
---------------------
Create a Java file and initialize 2 string variables(1-static-"Hello" and 1-Non static "World"). Create
2 methods(1-static and 1-non static) to print both the variables. Create a main method to call both 
the methods.
Expected Output - Hello World should be printed twice. 

 */
package week5DailyQuestions;

public class StaticNonstaticMethdDay5 {
	public static String test1 = "Hello";
	String test2 = "World";
	public static void main(String[] args) {
		/* declare 2 String variables (1 static- hello and 1 non static-world.
		 * create two methods 1 static and 1 non static to print both variables.
		 * create a main method to call both the methods.
		 * Expected o/p: Hello World should print twice*/
		method1();
		StaticNonstaticMethdDay5 obj1=new StaticNonstaticMethdDay5();
		obj1.method2();
	}
	public static void method1(){
		StaticNonstaticMethdDay5 obj=new StaticNonstaticMethdDay5();
		System.out.println(test1+" "+obj.test2);
	}
	public void method2(){
		System.out.println(test1+" "+test2);
	}
}
