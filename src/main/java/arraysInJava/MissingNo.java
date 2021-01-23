package arraysInJava;

public class MissingNo {
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		int sum = 0, sum1 = 0;
		for( int i = 1 ; i<=10; i++){
			sum = sum + i;
			
		}
		for (int j =0; j<a.length; j++){
			sum1=sum1+a[j];
		}
		int m = sum-sum1;
		System.out.println("the missing number is" +m);

	}

}
