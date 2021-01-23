package testNGParallellwithPriority;

import org.testng.annotations.Test;

public class TcPrioritywithParallel {

	
		@Test(priority=10)
		public void tc001(){
			System.out.println("tc2012");
		}
		@Test(priority=21)
		public void tc002(){
			System.out.println("tc2014");
		}
		@Test(priority=3)
		public void tc003(){
			System.out.println("tc003");
		}
		@Test(priority=4)
		public void tc004(){
			System.out.println("tc004");
		}
		@Test(priority=5)
		public void tc005(){
			System.out.println("tc005");
		}
		@Test(priority=6)
		public void tc006(){
			System.out.println("tc006");
		}
		
		public static void main(String[] args) {
	}

}
