package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FirstnonOccuranceChar {

	public static void main(String[] args) {
		String s="i will clear this interview";
		s=s.toLowerCase().replaceAll("\\s","");
		char[] c=s.toCharArray();
		//TreeMap<Character, Integer> map=new TreeMap<Character,Integer>();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		for(char char1:c)
		{
			if(map.containsKey(char1))
			{
				map.put(char1, map.get(char1)+1);
				//System.out.println(map);
			}
			else
			{map.put(char1,1);
				
			}
		
		}
		//Entry<Character,Integer> e1=new EntrySet<Character,Integer>();
		
	}

	}
