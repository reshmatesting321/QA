package javaInterviewQuestUSA;

public class SecondMinOfArray {

	
		public static void main(String[] args) {
		int[] a = {565, 43, 32, 2, 10, 30, 33};
	    int smallest = 0;
	    int secondSmallest = 0;
	    for (int i = 0; i < a.length; i++) 
	    {
	        if(a[i]==smallest)
	        {
	          secondSmallest=smallest;
	        } 
	        else if (a[i] < smallest) 
	        {
	            secondSmallest = smallest;
	            smallest = a[i];
	        } 
	        else if (a[i] < secondSmallest) 
	        {
	            secondSmallest = a[i];
	        }

	    }
	    System.out.println(secondSmallest);
		}
		
		/*public static int[] secondMin(int[] m, int pos){
		  int i, min;
		min=m[pos-1];
		for(i=pos;i<m.length;i++)
		{
			if(min>m[i]){
				min=m[i];
			}
		}
		if(pos>1)
		{System.out.println("SecondMin: "+ min);}
		
			for(i=0;i<m.length;i++)	{
				if(min==m[i]){
					int temp=m[0];
					m[0]=m[i];
					m[i]=temp;
				}
			}
			return m;
		}

		public static void main(String[] args) {
	int n[]={54,67,23,-768,42};
	int m[]=secondMin(n,1);
	int k[]=secondMin(m,2); 
		
		
		} */

}
