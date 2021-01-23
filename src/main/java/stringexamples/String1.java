package stringexamples;

public class String1 {

	public static void main(String[] args) {
		// Swapping index 3 n 4 places
		String s="HEL LO", s1="",s2="";
		s1=s.substring(3, 5);		
		for(int i=s1.length();i>0;i--)
		{
			s2=s2+s1.charAt(i);			
		}
s1=s.substring(0,3)+s2+s.substring(5);
System.out.println(s1);
	}
}
