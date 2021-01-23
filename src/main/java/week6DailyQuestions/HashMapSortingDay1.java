/*
Daily Questions:
----------------
1. What is the difference between final, finally & finalize keywords in Java?
2. Explain the 4 different constructors to create a HashMap with examples.

Coding Challenge #27:
---------------------
1. Write a Java program to sort the HashMap based on the Key.
Input:
21=Twenty One
41=Thirty One
31=Thirty One
Output:
21=Twenty One
31=Thirty One
41=Thirty One
 */
package week6DailyQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(21, "Twenty One");
		map.put(41, "Thirty One");
		map.put(31,"Thirty One");
		Map<Integer, String> sortMap=new TreeMap<Integer,String>(map);
		Set c=sortMap.entrySet();
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry) it.next();
			Integer key=(Integer) entry.getKey();
			String Val=(String) entry.getValue();
			System.out.println(key +" = "+Val);
		}
	}

}
