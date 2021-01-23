package javaInterviewQuestUSA;

public class MinOfArray {

public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]={21,16,6,33,4,32,87};
int min=n[0];

for(int i=1;i<n.length;i++){
	
	if(n[i]<min)
	{
		min=n[i];
		
	}
}
	
for(int i=0;i<n.length;i++)
{
	if(min==n[i]){
		System.out.println("Minimum: "+n[i]);
		
	}
System.out.println(n[i]);
}

	}

}
