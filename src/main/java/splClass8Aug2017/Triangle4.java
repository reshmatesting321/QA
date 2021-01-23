package splClass8Aug2017;

public class Triangle4 {

	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=n;i++)
			{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}

	}

}
