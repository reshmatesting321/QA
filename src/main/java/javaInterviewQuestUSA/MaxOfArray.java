package javaInterviewQuestUSA;

public class MaxOfArray {
	public static void main(String[] args) {
int m[]={232,87,-3,756};
	int i, max;
	max=m[0];
	for(i=1;i<m.length;i++)
	{
		if(m[i]>max){
		
			max=m[i];
		}
	}
	System.out.println("Max: "+ max);}
	}
