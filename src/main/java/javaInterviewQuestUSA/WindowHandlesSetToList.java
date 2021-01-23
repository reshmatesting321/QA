package javaInterviewQuestUSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;





public class WindowHandlesSetToList {

	public static void main(String[] args) {
		RemoteWebDriver driver;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String s=driver.getWindowHandle();
		driver.findElementById("button1").click();
		driver.findElementByLinkText("New Message Window").click();
		
		Set<String> s1 = driver.getWindowHandles();
		List<String> allWind = new ArrayList<String>();
		allWind.addAll(s1);
		int n = allWind.size();
		System.out.println(n);
		driver.switchTo().window(allWind.get(1));
		//driver.findElementByXPath("//*[@id='page']/div[1]/div[2]/div[3]/a/img").click();
		driver.findElementByClassName("dt-mobile-menu-icon").click();
		//driver.close();
		driver.switchTo().window(allWind.get(0));
		driver.findElementByLinkText("New Browser Tab").click();
		System.out.println("hi");
		
	}

}
