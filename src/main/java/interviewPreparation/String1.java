package interviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="reshma";
		String s1;
		String a[]=new String[6];
		for(int i=0;i<6;i++)
		{
			s1=s.substring(i,i+1);
			a[i]=s1;
			System.out.println(a[i]);
			
		}*/
		//for(int j=0;j<6;j++)
		//System.out.println(a[j]);
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Reshma");
		System.out.println("hello");
		//System.out.println(driver.findElementById("firstNameField").getText());
		System.out.println("hi");
		System.out.println(driver.findElementById("firstNameField").getAttribute("value"));
		driver.findElementById("lastNameField").sendKeys("Brema");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Reshma1");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Brema1");
		driver.findElementById("createContactForm_personalTitle").sendKeys("Welcome");
		driver.findElementByName("submitButton").click(); 

	}

}
