package testcases;

import org.testng.annotations.Test;

public class Deleteleadprint {
	@Test(dependsOnMethods="Editleadprint")
	public void deleteLead()
	{
		System.out.println("Delete Lead");
	}
}
