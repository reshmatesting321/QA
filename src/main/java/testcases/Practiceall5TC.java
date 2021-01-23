package testcases;

import org.testng.annotations.Test;

public class Practiceall5TC {
	/*2) a) CreateLead should run 2times
		@Test(invocationCount=2)
		public void createLead()
		{
			System.out.println("Create Lead");
		} */
	/*2 ) b) MeargeLead should completed within 20 sec
	@Test(timeOut=20000)
	public void mergeLead()
	{
		System.out.println("Merge Lead");
	}
	*/
	// 2) c) Run Create, Edit, Delete and MergeLeads in parallel for 2 Thread counts 
	//and bring the observation
	/*@Test(invocationCount=2, threadPoolSize=2)
	public void createLead()
	{
		System.out.println("Create Lead");
	}
	@Test(invocationCount=2, threadPoolSize=2)
	public void editLead()
	{
		System.out.println("Edit Lead");
	}
	@Test(invocationCount=2, threadPoolSize=2)
	public void deleteLead()
	{
		System.out.println("Delete Lead");
	}
	@Test(invocationCount=2, threadPoolSize=2)
	public void mergeLead()
	{
		System.out.println("Merge Lead");
	}
	@Test
	public void duplicateLead()
	{
		System.out.println("Duplicate Lead");
	}
	/*3) i) The Merge lead is not ready, hence do not run it
	@Test(enabled=false)
	public void mergeLead()
	{
		System.out.println("Merge Lead");
	}  */
	/*3) ii)The Create lead should run 2 times but the overall invocation should complete
	 *  with 2 minutes, else fail 		  it

	@Test(invocationCount=2, invocationTimeOut=200000)
	public void createLead()
	{
		System.out.println("Create Lead");
	} */
	@Test(dependsOnMethods="deleteLead") //b
	public void createLead()
	{
		System.out.println("Create Lead");
	}
	@Test()
	public void editLead() //a
	{
		System.out.println("Edit Lead");
	}
	@Test(dependsOnMethods="editLead") //c
	public void deleteLead()
	{
		System.out.println("Delete Lead"); 
	}
	@Test()
	public void mergeLead()
	{
		System.out.println("Merge Lead");//d
	}

}
