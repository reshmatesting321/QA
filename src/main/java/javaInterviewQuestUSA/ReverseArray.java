package javaInterviewQuestUSA;

public class ReverseArray {
	
	public static int[] reverseArr(int[] a){
		int[] r=new int[5];
		
		
		int k=0;
		for(int i=a.length-1;i>=0;i--){
			if(k<5)
				r[k] = a[i];
			
			k++;
			
		}
		
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[]b=new int[a.length];
		b=ReverseArray.reverseArr(a);
		for (int z=0;z<5;z++){
			System.out.println(b[z]);
		}

	}

}
