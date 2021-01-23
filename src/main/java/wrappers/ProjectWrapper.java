package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Parameters;

public class ProjectWrapper extends WrapperMethods {
	@Parameters({"browser","URL","uname","pswd"})
	/*@BeforeMethod(groups={"common"}) */
	
	/*@BeforeMethod
	public void login(String browser, String URL, String uname, String pswd) {
		invokeApp(browser, URL);
		enterById("username", uname);
		enterById("password", pswd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		
	} */
	@BeforeMethod(groups={"common"})
	  public void login(){
		   invokeApp("chrome", "http://leaftaps.com/opentaps");
			enterById("username", "DemoSalesManager");
			enterById("password", "crmsfa");
			clickByClassName("decorativeSubmit");
			clickByLink("CRM/SFA");
	  }
	@DataProvider(name="fetchDataCreate")
	public String[][] getData()
	{
	String[][] createData=new String[1][5];
		createData[0][0]="wwwc";
		createData[0][1]="Reshma123";
		createData[0][2]="R";
		createData[0][3]="9876543211";
		createData[0][4]="brema.rehma@gmail.com"; 
	
	return createData;
	}
	@DataProvider(name="fetchDataEdit")
	public String[][] getData1()
	{
	String[][] editData=new String[1][2];
		editData[0][0]="Reshma";
		editData[0][1]="TestLeafEdit"; 
	
	return editData;
	}
	@DataProvider(name="fetchDataDel")
	public String[][] getData2()
	{
	String[][] delData=new String[1][1];
	delData[0][0]="123";
	return delData;
	}
	
	@DataProvider(name="fetchDataMerge")
	public String[][] getData3()
	{
	String[][] mergeData=new String[1][2];
		mergeData[0][0]="11128";
		mergeData[0][1]="11129"; 
	
	return mergeData;
	}
	@DataProvider(name="fetchDataDup")
	public String[][] getData4()
	{
	String[][] dupData=new String[1][1];
	dupData[0][0]="sai@gmail.com";
	return dupData;
	}
		//@AfterMethod(groups={"common"})
	@AfterMethod
	public void closeApplication(){
		closeBrowser();
		
	}
	
	
	

	
}
