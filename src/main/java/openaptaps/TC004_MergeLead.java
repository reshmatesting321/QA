package openaptaps;


import org.testng.annotations.Test;

import wrappers.ProjectWrapper;
import wrappers.WrapperMethods;

public class TC004_MergeLead extends ProjectWrapper {

	@Test(dataProvider="fetchDataMerge")
	public void Merge(String ID1, String ID2) throws InterruptedException {
		//TC_004   Test case 4 - Merge Lead.
		
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",ID1);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		trySleep();
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		trySleep();				
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",ID2);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		trySleep();
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		trySleep();
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",ID1);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		String s23=getAlertText();
		if(s23.contains("No records to display"))
		{
			System.out.println("The ID is merged");
		}
		else
		{
			System.out.println("The ID is not merged");
		}
		
	}
}
