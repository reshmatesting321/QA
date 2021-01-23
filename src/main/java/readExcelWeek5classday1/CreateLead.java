package readExcelWeek5classday1;

import org.testng.annotations.Test;



import wrappers.LeafTapsWrapperWeek5classday1;



public class CreateLead extends LeafTapsWrapperWeek5classday1{



	

	@Test(dataProvider="fetchData")

	public void createLead(String CN,String FN,String LN) throws Exception{		

		clickByLink("Leads");

		clickByLink("Create Lead");

		enterById("createLeadForm_companyName",CN);

		enterById("createLeadForm_firstName",FN);

		enterById("createLeadForm_lastName", LN);		

		enterById("createLeadForm_primaryEmail", "reshma@testleaf.com");

		enterById("createLeadForm_primaryPhoneNumber", "9894104276");

		clickByXpath("//input[@name='submitButton']");		



	}

}