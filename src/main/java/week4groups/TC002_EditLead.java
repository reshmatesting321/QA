package week4groups;




import org.testng.annotations.Test;

import wrappers.ProjectWrapper;
import wrappers.WrapperMethods;

public class TC002_EditLead extends ProjectWrapper {
	//@Test(groups={"sanity"}, dependsOnGroups={"smoke"})
	@Test(groups={"sanity"}, dependsOnGroups={"smoke"}, dataProvider="fetchDataEdit") 
	//@Test(groups={"sanity"}, dataProvider="fetchDataEdit") //@Test for iii) Run all 5 TestCases in parallel
	public void TC002_editLead(String FN, String CN) {


		//TC_002  Test case 2 - Edit Lead.
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]",FN);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		trySleep();
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		trySleep();
		verifyTitle("http://leaftaps.com/crmsfa/control/viewLead?partyId=");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName",CN);
		clickByName("submitButton");
		verifyTextById("viewLead_companyName_sp",CN);
		
	}

}
