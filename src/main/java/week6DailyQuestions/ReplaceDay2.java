/*
 Daily Questions:
 -----------------
 1. Wht is d difference between abstract class and interface in Java?When do u favour abstract class over I/F?
Point 1:
--Abstract class has both the definition and declarations of methods (Both Abstract and Non-Abstract methods)

--Interface has only the declarations of methods (Only Abstract methods)

Point 2:
--Abstract class can be extend by only one Abstract class
--Interface can be extended by any number of interfaces

--Interfaces can be implemented by any type of classes

Point 3:
--When a class is extending an abstract class, the sub class should implement the abstract methods of the 
abstract class(If it does not implement all the abstract methods then the sub class should be also abstract) 

--When a class in implementing an interface, the class should implement all the methods of the 
interface(If it does not implement all the interface then the class should be made abstract) 

Point 4:
--In case if we want to use the commonly defined methods in the sub classes, we prefer 
Abstract class than the interface (as interface does not have the method definitions)

 2. What is the difference between StringBuffer and StringBuilder classes?
 --StringBuffer is Threadsafe (synchronized)
--StringBuilder is not Threadsafe(non-synchronized)
--ie., In StringBuffer, two threads cannot access the methods of StringBuffer at the same time
(the method will be locked until the thread processing is completed)
--whereas, in StringBuilder, two threads can call the methods of StringBuilder simultaneously.
--StringBuffer is less efficient as it is synchronized
--StringBuilder is more efficient as it is non-synchronized
--Both StringBuffer and StringBuilder is mutable
 
 Coding Challenge #28:
 ---------------------
 Write a Java prg to replace 2 or more spaces with single space and delete only trailing space in a string?
 Ex:
 Input: " aa bbbbbb   ccc  d "
 Output: " aa bbbbbb   ccc  d"
 
 */
package week6DailyQuestions;

public class ReplaceDay2 {

	public static void main(String[] args) {
		String s=" aa bbbbbb   ccc  d ";
		System.out.println(s);
		System.out.println("To replace 2 or more white space with single space:");
		s=s.replaceAll("\\s{2,}"," ");
		System.out.println(s);
		System.out.println("To delete trail:");
		s = s.replaceAll("\\s+$", "");
		
		System.out.println(s);
	}

}
