package week8classwork;

import java.util.Arrays;

public class ArrayExDay1 {

	public static void main(String[] args) {
		// Avoid duplicate in a array of #s
		int a[]={1,7,8,7,1};
		
		Arrays.sort(a);
		//System.out.println(a[0]);
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			
				if(a[i]!=a[i-1])
				{
					//System.out.println(a[i]);
				}
				
			
		}
		//binary search
		for(int i=0;i<n;i++)
		{if(Arrays.binarySearch(a,a[i])==i)
			
			System.out.println(a[i]);
		}
	}

}
