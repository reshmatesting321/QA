package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapPractice {

	public static void main(String[] args) {
		String s="I aam the winner";
		s=s.toLowerCase().replaceAll("\\s","");
		char[] c=s.toCharArray();
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>();
		//LinkedHashMap<Character, Integer> map1=new LinkedHashMap<Character,Integer>();
		for(char char1:c)
		{
			if(map.containsKey(char1))
			{
				map.put(char1, map.get(char1)+1);
				//map.get(char1) - will return the value for that key, char1
			}
			else
			{map.put(char1,1);
			
				
			}
		
		}
		for(char c1:c)
		{if(map.get(c1)==1)
			{System.out.println(c1);
			System.out.println(map.get(c1));
			break;}
		}
		
		//System.out.println(map);
	}

	}
