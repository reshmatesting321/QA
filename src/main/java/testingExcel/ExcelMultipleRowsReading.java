package testingExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelMultipleRowsReading  {
	
	
	
	@Test(dataProvider = "excel1") 
	public void excelRead1 (String Fn, String Ln){
	String baseUrl;
	baseUrl="https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp";
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
    
    	
    	driver.findElementById("firstName").sendKeys(Fn);
    	driver.findElementById("lastName").sendKeys(Ln);
    	driver.close();
    }
    	
	@DataProvider(name = "excel1") 
	public static Object[][] getData() {
		
		return ExcelFile.getData("TC002");
		
	} 
	


	
}
