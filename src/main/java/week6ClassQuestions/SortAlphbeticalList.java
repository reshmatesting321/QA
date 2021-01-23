package week6ClassQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortAlphbeticalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cn=new ArrayList();
		cn.add("KLA");
		cn.add("Amazon");
		cn.add("Paypal");
		cn.add("Microsoft");
		
		//Sol 1:
		Collections.sort(cn);
		for(String s:cn)
		{
			System.out.println(s);
		}
		
		
		//s.size();
		//for(int i=0;i<cn.size();i++)
		
		//Sol2:
		TreeSet<String> cn1=new TreeSet<String>();
		cn1.add("KLA");
		cn1.add("Amazon");
		cn1.add("Paypal");
		cn1.add("Microsoft");
		for(String s1:cn1)
		{
			System.out.println(s1);
			
		}
		
		//reverse order
		
		System.out.println(cn1.descendingSet());
		
		
		
		
		
		
			
		

	}

}
