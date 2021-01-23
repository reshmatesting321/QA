package interviewPreparation;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normal triangle
		for (int i = 0; i < 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }		
		//Right triangle
		for (int i = 0; i < 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
		//Left Triangle
		for(int i=0;i<5;i++)
	     {
	         for(int j=0;j<=i;j++)
	         {
	             System.out.print("*");
	         }
	         System.out.println("\n");
	     }
		
		//---------------------------
		//Diamond Triangle
				for (int i = 1; i < 7; i += 2) {
				      for (int j = 0; j < 9 - i / 2; j++)
				        System.out.print(" ");

				      for (int j = 0; j < i; j++)
				        System.out.print("*");

				      System.out.print("\n");
				    }

				    for (int i = 7; i > 0; i -= 2) {
				      for (int j = 0; j < 9 - i / 2; j++)
				        System.out.print(" ");

				      for (int j = 0; j < i; j++)
				        System.out.print("*");

				      System.out.print("\n");
				    }

	}

}
