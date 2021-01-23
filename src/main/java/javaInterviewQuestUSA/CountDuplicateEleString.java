package javaInterviewQuestUSA;

public class CountDuplicateEleString {
public static void main(String[] args) {
String s="aabcbsdbbahb";
char[] c=s.toCharArray();
int i,j, count = 0 ;

for(i=0;i<c.length;i++)
{
	if(Character.isWhitespace(c[i]))
		continue;
	count=1;
	
	for(j=i+1; j<c.length; j++)
	{
		if(c[i]==c[j])
		{
			c[j]=' ';
			count++;	
		}
	}
	if(count>1)
	System.out.println(("The letter "+ c[i] +"  occurs " + count +" times"));
}
	}
}
