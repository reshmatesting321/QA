package implemntAttribute;

import org.testng.annotations.Test;
import wrappers.ProjectWrapper;

public class TC001_CreateLead extends ProjectWrapper {
	
	//ii) The Create lead should run 2 times but the overall
	//invocation should complete with 3 minutes, else fail it
	@Test(invocationCount=2, invocationTimeOut=300000)
public void createLead() {
		clickByLinkNoSnap("Create Lead");
		enterById("createLeadForm_companyName", "wwwc");
		enterById("createLeadForm_firstName", "Reshma");
		enterById("createLeadForm_lastName", "R");
		selectIndexById("createLeadForm_dataSourceId");
		selectwithValueIndexById("createLeadForm_marketingCampaignId",5);
		enterById("createLeadForm_primaryPhoneNumber", "9234567893");
		enterById("createLeadForm_primaryEmail", "brema.reshma@gmail.com");
		clickByName("submitButton");
		String getFirstName=getTextById("viewLead_firstName_sp");
		if(getFirstName.equals("Reshma"))
		{
			System.out.println("First Name is verified and its same");
		}
		else
		{
			System.out.println("First Name is verified and its NOT same");
		}	
	}
}