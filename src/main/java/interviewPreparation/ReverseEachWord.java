package interviewPreparation;

public class ReverseEachWord {
	static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
   String reverseString = "";         
        for (int i = 0; i < words.length; i++) 
        {            String word = words[i];             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);         
        System.out.println(reverseString);         
        System.out.println("-------------------------");
    }
     
    public static void main(String[] args) 
    {
        reverseEachWordOfString("Java Concept Of The Day");
    }
}
        /*
         * public static void main(String args[])
in parts:

public

It means that you can call this method from outside of the class you are currently in. This is necessary because this method is being called by the Java runtime system which is not located in your current class.
static

When the JVM makes call to the main method there is no object existing for the class being called therefore it has to have static method to allow invocation from class.
void

Java is platform independent language and if it will return some value then the value may mean different things to different platforms. Also there are other ways to exit the program on a multithreaded system. Detailed explaination.
main

It's just the name of method. This name is fixed and as it's called by the JVM as entry point for an application.
String args[]

These are the arguments of type String that your Java application accepts when you run it.

-------------------------------------------
public : it is a access specifier that means it will be accessed by publically.
static : it is access modifier that means when the java program is load then it will create the space in memory automatically.
void : it is a return type i.e it does not return any value.
main() : it is a method or a function name.
string args[] : its a command line argument it is a collection of variables in the string format.
         */
   