package wrappers;



import java.io.IOException;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import readExcelWeek5classday1.ReadExcel;



public class LeafTapsWrapperWeek5classday1 extends WrapperMethods{
	@DataProvider(name="fetchData")	
	public static String[][] getData() throws InvalidFormatException, IOException
	{
		ReadExcel rd = new ReadExcel();

		return rd.readExcel("CreateLead");

	}
	public static String[][] getData1() throws InvalidFormatException, IOException
	{
		ReadExcel rd1 = new ReadExcel();
String[][] s=new String[1][2];
s=rd1.readExcel("Login");
		return s;
	}
	@BeforeMethod
	  public void login() throws InvalidFormatException, IOException{
		String[][] s1=new String[1][2];
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		s1=getData1();
		 
		for(int i=0;i<s1.length;i++)
		{
		
			enterById("username", s1[i][i]);
			enterById("password", s1[i][i+1]);
		}
		
			clickByClassName("decorativeSubmit");
			clickByLink("CRM/SFA");
	  }
	@AfterMethod
	public void closeApplication(){
		closeBrowser();
		
	}
}

