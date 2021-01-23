package interviewPreparation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		
		

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//Open Url
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		//To MAximize
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		
		List<WebElement> allframes = driver.findElementsByXPath("//iframe");
		
		int noOfFrames = allframes.size();
		int noOfChildFrames = 0;
		
		System.out.println("Size of the Main iFrames " +noOfFrames);
		
		for (int i=0; i<noOfFrames;i++) {
			driver.switchTo().frame(i);
			System.out.println("No of child Frames inside " +i+ " st Frame is "+driver.findElementsByXPath("//iframe").size());
			noOfChildFrames = noOfChildFrames + driver.findElementsByXPath("//iframe").size();
			driver.switchTo().parentFrame();
		}
		
		System.out.println("Size of the child iFrames " +noOfChildFrames);
		int total =noOfChildFrames+noOfFrames;
		System.out.println("Total Frames in this page is " +total);
			//Nested Frame Example
		driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElementByXPath("//*[@id='page']/following-sibling::div/iframe"));
		System.out.println(driver.findElementByXPath("//*[@id='page']/following-sibling::div/iframe[0]").getText());
	driver.switchTo().parentFrame();
	//driver.switchTo().frame(1);
	driver.switchTo().frame(driver.findElementByXPath("//*[@id='footerWrapper']/iframe"));
	System.out.println(driver.findElementByXPath("//*[@id='footerWrapper']/iframe").getText());
	
				
			}

		}

