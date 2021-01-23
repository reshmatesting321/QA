package week6ClassQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class MapExample {

	public static void main(String[] args) {
		//Creating EntrySet for "INDIA"
		String s="INDIA";
		char[] c=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//Set<Character> set1=new TreeSet<Character>();
		for(char c1:c)
		{
			if(map.containsKey(c1)){
				int val=map.get(c1)+1;
				map.put(c1, val);
				//map.set(c1, val);
			}
			else{
				map.put(c1, 1);

			}
		}
		System.out.println(map); 
	/*	for(char c2:c)
		{
			System.out.println(set1.add(c2));
		}*/
			
	}
}
