package week8classwork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDay2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		//Search and click open  incidents
		
		//To scroll down
		((JavascriptExecutor)driver).executeScript("scroll(0,1800)");
		
	}

}
