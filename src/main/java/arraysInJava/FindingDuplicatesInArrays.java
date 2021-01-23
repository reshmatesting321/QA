package arraysInJava;

public class FindingDuplicatesInArrays {

//	int h = 9;
//	int h1 = String.valueOf(h).length();
//System.out.println(h1);
//	char s='a';
//	int l=String.valueOf(s).length();
//	System.out.println(l);
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5,1};
		int[] arr1 = new int[arr.length];
		int count = 0;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){//a. 1,2 b.1,2,3
				if(arr[i]==arr[j]){
					arr1[count]=arr[i];
					System.out.println(arr1[count]);
					count++;
				}
			}
			
		}
		

	}

}
