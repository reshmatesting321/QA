/*
 Daily Questions:
 ----------------
 1. What is the difference between Page Object Model and Project Object Model (POM)?
Page Object Model
--is a framework which groups the web elements present in a page
--For each page, there is a unique class
--Each Page class identifies the web elements present in that page
--In each class, there is a unique method to handle the actions performed upon that web element
--The method name should be relevant to the action performed

--Project Object Model or POM is the fundamental unit of work in Maven
--It is an XML file that contains information about the Project
--It contains the configuration details that is used by Maven to build the project
--Earlier in Maven 1, it was project.xml
--In Maven 2, it is renamed as pom.xml
--Instead of having maven.xml - that contain the goals to be executed, goals or plugins are now configured in pom.xml
--While executing a task or goal, Maven will look for POM in the directory
--Maven will read the POM, get the needed configuration details and executes the goal
--pom.xml contains default values for most projects.
--Eg: build directory: target, source directory: src/main/java, test source directory: src/test/java


 2. Is it possible to run the test cases parallel in Page object model? If yes, how to do that?
--Yes. It is possible to run the test cases parallel in Page Object model using the TestNG xml with parallel="classes".
--In page object model, when we are writing a test case, at the first step, we should be passing the new instance to the driver and test and pass it along the pages it navigates through.
--Same way, when the other test case is getting executed, even for that test case, we should pass a new instance of the driver.
--This helps us to run the test cases parallel in page object model.

 
 Coding Challenge #22
 ---------------------
 Write a java program to swap two strings without using a third variable.
 */
package week5DailyQuestions;

public class Swap2NosDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Declare two strings
	        String a = "Hello123";
	        String b = "World";
	         
	        // Print String before swapping
	        System.out.println("Strings before swap: a = " + a + " and b = "+b);
	         
	        //Initial length of a
	        int aLen = a.length();
	        // append 2nd string to 1st
	        a = a + b;
	         
	        // store intial string a in string b
	        b = a.substring(0,aLen);
	         
	        // store initial string b in string a
	        a = a.substring(b.length());
	         
	        // print String after swapping
	        System.out.println("Strings  after swap: a = " + a + " and b = " + b);  
		
	}

}
