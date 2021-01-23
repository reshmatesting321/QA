package splClass8Aug2017;

public class BuiltinPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
//String s="liril";
String s=Integer.toString(n);
StringBuilder sb=new StringBuilder();
sb.append(s);

StringBuilder sb1=sb.reverse();


if(sb1.equals(sb))
{
	System.out.println("Palindrome");
}


	}

}
