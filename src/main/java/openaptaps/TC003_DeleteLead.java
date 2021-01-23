package openaptaps;

import org.testng.annotations.Test;

import wrappers.ProjectWrapper;
import wrappers.WrapperMethods;

public class TC003_DeleteLead extends ProjectWrapper {

	@Test(dataProvider="fetchDataDel")
	public void DeleteLead(String PN) throws InterruptedException {
		//TC_003   Test case 3 - Delete Lead.
		
				clickByLink("Leads");
				clickByLink("Find Leads");
				clickByXpath("//span[text()='Phone']");
				enterByName("phoneNumber",PN);
				clickByXpath("//button[contains(text(),'Find Leads')]");
				trySleep();
				String s=getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				System.out.println("Lead ID is " +s);
				clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				trySleep();
				clickByLink("Delete");
				clickByLink("Find Leads");
				//getTextByXpath("//span[text()='Phone']");
			enterByName("id",s);
			//clickByLink("Find Leads");
			clickByXpath("//button[contains(text(),'Find Leads')]");
			String s1=getAlertText();
			if(s1.contains("No records to display"))
			{
				System.out.println("Given Lead ID is deleted");
			}
			else
			{
				System.out.println("Error while deleting the ID");
			}
				
	}
}
