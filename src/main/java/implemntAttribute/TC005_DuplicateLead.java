
package implemntAttribute;


import org.testng.annotations.Test;

import wrappers.ProjectWrapper;
import wrappers.WrapperMethods;

public class TC005_DuplicateLead extends ProjectWrapper {
	@Test(groups={"regression"}, dependsOnGroups={"sanity"}, dataProvider="fetchDataDup")
	//@Test(groups={"regression"}, dataProvider="fetchDataDup") //iii) Run all 5 TestCases in parallel
	public void Duplicate(String eMail) throws InterruptedException {
		
		//TC_005   Test case 5 - Duplicate Lead.
		//login();
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[contains(text(),'Email')]");
				enterByName("emailAddress",eMail);
				clickByXpath("//button[contains(text(),'Find Leads')]");
				trySleep();
				
				String firstName=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
				System.out.println("First Name is " +firstName);
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				trySleep();
				clickByLink("Duplicate Lead");
				String getTitle=getTextById("sectionHeaderTitle_leads");
				if(getTitle.equals("Duplicate Lead"))
				{
				System.out.println("The Title Displayed is: "+getTitle);
				}
				clickByName("submitButton");
				String getName=getTextById("viewLead_firstName_sp");
				if(getName.equals(firstName))
				{
					System.out.println("Confirmed: the duplicated lead name is same as captured name");
					
				}
				else
				{
					System.out.println("Not Confirmed: the duplicated lead name is same as captured name");
				}
				//closeBrowser();	
	}
}
