package splClass8Aug2017;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Am a Hero";
String s1="";
s.replaceAll("^[A-Za-z]","");
for(int i=s.length()-1;i>0;i--)
{
	s1=s1+s.charAt(i);
	
}
System.out.println(s1);
	}

}
