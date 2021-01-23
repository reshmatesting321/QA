package stringexamples;

public class TocharArray {

	public static void main(String[] args) {
		// Count how many same char in the string
		String s="Cognizant";
		char c='n';
		int n=0;
		//s=s.toLowerCase();
		char stc[]=s.toLowerCase().toCharArray();
		for(char t:stc)
		{
			if(t==c)
			{
				n++;
			}
		}
		System.out.println(n);
int r;

r=s.replaceAll("n", " ").length();

	System.out.println(r);
	
	}
	

}
