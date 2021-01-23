package splClass8Aug2017;

import java.util.Arrays;

public class Anagram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="army1";
		String s1="mary";
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if(Arrays.equals(c,c1))
		{
			System.out.println("Anagram");
		}
		else
		{System.out.println("Not Anagram");
		
		}
	}

}
