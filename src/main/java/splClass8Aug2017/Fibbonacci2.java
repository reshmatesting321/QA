package splClass8Aug2017;

public class Fibbonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a=0, b=1;
		int c,r=7;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<r;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
