package collections1;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;;

public class ArrLstClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println(s);
ArrayList<String> copy=(ArrayList<String>) s.clone(); //s.clone() is object , hence typecased to ArrayList<String>
Iterator itr = copy.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());    
}
List<String> add=new ArrayList<String>();
add.addAll(s);
System.out.println(add);
//s.clear(); //to clear all the elements in array list
//s.remove("A");System.out.println(s); //to remove a element in the array
/* copying arraylist to an array
 *  ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
            
         */
/*containsall
            ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));
        list.add("one");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));
             */
             
        /*
         * sublist
         * ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = arrl.subList(2, 4);
        System.out.println("Sub List: "+list); 
         */
 /*
  *
  *reverse list & shuffle && swap
  ArrayList<String> list = new ArrayList<String>();
  list.add("Java");
  list.add("Cric");
  list.add("Play");
  list.add("Watch");
  list.add("Glass");
  Collections.reverse(list);
  System.out.println("Results after reverse operation:");
  for(String str: list){
      System.out.println(str);
      
      Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
            
            Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation:");
        for(String str: list){
            System.out.println(str);
  */

	}

}
