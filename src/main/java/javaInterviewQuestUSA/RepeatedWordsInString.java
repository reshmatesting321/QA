package javaInterviewQuestUSA;

public class RepeatedWordsInString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String source = "the moon is so blue and is the white moon the";
		String[] splitString = source.split(" ");
		int i,j, count = 0 ;
		for(i=0; i<splitString.length; i++)
		{
			count = 1;
			
			if(splitString[i] == " ")
				continue;
			
			for(j=i+1; j<splitString.length; j++)
			{
				if(splitString[i].compareToIgnoreCase(splitString[j])==0)
				{
					splitString[j] = " ";
					count ++;				
				}
			}
			
			if(count > 1)
				System.out.println("Repeated string: " + splitString[i] + " "  + count);
			
			count = 0;
		}
	}
}
