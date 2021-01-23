package week6ClassQuestions;

public class CountofNinastring {
	public static void main(String[] args) {
		
		String cn="Cognizant";
		char c='n';
		int len=cn.length();
		/*
		char[] c1=cn.toCharArray();
		int j=0 ;
		for(char x:c1)
		{
			if(x==c){
			j++;	
			
			}
		}
		System.out.println(j); */
		int j=0;
		char ch;
		for(int i=0;i<cn.length();i++)
		{
			ch=cn.charAt(i)	;
			if(ch=='n')
		{
			j=j+1;
			
		}
			
		}	
		System.out.println(j);
	
	}
	
}

		
		
		
		
	


