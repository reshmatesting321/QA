package openaptaps;

import org.testng.annotations.Test;
import wrappers.ProjectWrapper;

public class TC001_CreateLead extends ProjectWrapper {
	@Test(dataProvider="fetchDataCreate",invocationCount=3)
	public void createLead(String CN, String FN, String LN, String PNo,String eMail) {	    
		clickByLinkNoSnap("Create Lead");
		enterById("createLeadForm_companyName", CN);
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", LN);
		selectIndexById("createLeadForm_dataSourceId");
		selectwithValueIndexById("createLeadForm_marketingCampaignId",5);
		enterById("createLeadForm_primaryPhoneNumber", PNo);
		enterById("createLeadForm_primaryEmail", eMail);
		clickByName("submitButton");
		String getFirstName=getTextById("viewLead_firstName_sp");
		if(getFirstName.equals(FN))
		{
			System.out.println("First Name is verified and its same");
		}
		else
		{
			System.out.println("First Name is verified and its NOT same");
		}	
	}
}