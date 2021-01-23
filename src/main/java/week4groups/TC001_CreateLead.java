package week4groups;

import org.testng.annotations.Test;
import wrappers.ProjectWrapper;
//TEST NG Groups example testcase
public class TC001_CreateLead extends ProjectWrapper {
	
	@Test(groups={"smoke"}, dataProvider="fetchDataCreate") //iii) Run all 5 TestCases in parallel
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