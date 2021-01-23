package javaInterviewQuestUSA;

public class SecondMaxOfArray {
	public static int[] secondMax(int[] m, int pos){
		int i, max;
		max=m[pos-1];
		for(i=pos;i<m.length;i++)
		{
			if(max<m[i]){
				max=m[i];
			}
		}
		if(pos>1)
		{System.out.println("SecondMax: "+ max);}
		
			for(i=0;i<m.length;i++)	{
				if(max==m[i]){
					int temp=m[0];
					m[0]=m[i];
					m[i]=temp;
				}
			}
			return m;
		}

		public static void main(String[] args) {
	int n[]={54,67,23,-768,42};
	int m[]=secondMax(n,1);
	int k[]=secondMax(m,2);
		}

}
