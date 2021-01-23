package arraysInJava;

public class StringArrToIntArr {
	public static void main(String[] args) {
	String a="12345";
	String[] s=a.split("");
	int[] n= new int[s.length];
	for(int i=0;i<n.length;i++){
		n[i]=Integer.parseInt(s[i]);
	}
	for(int j=0;j<n.length;j++)
	System.out.println(n[j]);
	}
}
