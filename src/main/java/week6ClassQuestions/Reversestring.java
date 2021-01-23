package week6ClassQuestions;

public class Reversestring {

	public static void main(String[] args) {
		String s="Infosys", reverse="";
		int len=s.length();
		int i;
		for(i=len-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}

}
