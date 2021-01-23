package week7Classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSplitWord {

	public static void main(String[] args) {
		
		String pattern="[A-Za-z]+";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("Amazon India Dvpt Center");
		while(match.find())
		{
		String s=match.group();
		//System.out.println(s);
		}
		
		String s="hi teja";
		System.out.println(s.replaceAll("[^A-Za-z]",""));
		
		

	}

}
