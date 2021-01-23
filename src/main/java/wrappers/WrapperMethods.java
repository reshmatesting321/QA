package wrappers;
//7550018922-kannan
//sasi-8144814554

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods implements Wrappers {
	RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		try
		{
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("The browser " + browser + " is launched");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();
		}
	}

	public void enterById(String idValue, String data) {
		try
		{
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The text field " + idValue + " is entered with value :" + data);
		}catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) throws InterruptedException {
		try{
		driver.findElementByName(nameValue).sendKeys(data);
		System.out.println("The name " + data + " is entered");
		Thread.sleep(1000);
		System.err.println(nameValue);
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		try{
		driver.findElementByXPath(xpathValue).sendKeys(data);
		System.out.println("The name " + data + " is entered");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();
		}

	}

	public void verifyTitle(String title) {
		try
		{
		if (driver.getCurrentUrl().contains(title)) {
			System.out.println("The title is same");
		}

		else {
			System.out.println("The title is not same");
		}
	}
	
	catch(NoSuchElementException e)
	{
		System.err.println("Enter by ID failed");
	}
	catch(WebDriverException e)
	{
		System.err.println("Browser does not exists");
	}
	finally
	{
	takeSnap();
	}
	}

	public void verifyTextById(String id, String text) {
try{
		String st = driver.findElementById(id).getText();
		System.out.println(st);
		if (st.contains(text)) {
			System.out.println("The values are correctly done");
		}
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();
}

	}

	public void verifyTextByXpath(String xpath, String text) {

	}

	public void verifyTextContainsByXpath(String xpath, String text) {

	}

	public void clickById(String id) {

		

	}

	public void clickByClassName(String classVal) {
try{
		driver.findElementByClassName(classVal).click();
		System.out.println("The button " + classVal + " is clicked");
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();
}
	}

	public void clickByName(String name) {
try{
		driver.findElementByName(name).click();
		System.out.println("The button " + name + " is  clicked");
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();
}
	}

	public void clickByLink(String name) {
try{
		driver.findElementByLinkText(name).click();
		System.out.println("The link " + name + " is clicked");
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();
}
	}

	public void clickByLinkNoSnap(String name) {
		try{
		driver.findElementByLinkText(name).click();
		System.out.println("The link " + name + " is clicked");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		

	}

	public void clickByXpath(String xpathVal) {
		try{
		
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The " + xpathVal + " is clicked");
		}catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
try{
		driver.findElementByXPath(xpathVal).click();
		System.out.println("The " + xpathVal + " is clicked");
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser123 does not exists");
}
}

	public String getTextById(String idVal) {
try{
		String getVal1 = driver.findElementById(idVal).getText();
		return getVal1;
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();

}
return null;
		
	}

	public String getTextByXpath(String xpathVal) {
		try{
		String strReturn1 = driver.findElementByXPath(xpathVal).getText();
		return strReturn1;
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		try{
		WebElement src = driver.findElementById(id);
		Select dd = new Select(src);
		dd.selectByVisibleText(value);
		System.out.println("The currency " + id + " is printed");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
	}

	public void selectIndexById(String id) {
		try{
		WebElement src1 = driver.findElementById(id);
		Select is = new Select(src1);
		List<WebElement> list1 = is.getOptions();
		int size1 = list1.size();
		is.selectByIndex(size1 - 3);
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
	}

	public void selectwithValueIndexById(String id, int value) {
		try{
		WebElement src1 = driver.findElementById(id);
		Select is = new Select(src1);
		is.selectByIndex(value);
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
	}

	public void switchToParentWindow() {
		try{
		Set<String> handles = driver.getWindowHandles();
		//int n = handles.size();
		
		for (String eachhandles : handles) {
			//if (n == 1) {
				driver.switchTo().window(eachhandles);
				//break;
			}
		//}
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
	}

	public void switchToLastWindow() {
		try{
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String eachhandles : handles) {
			if (!eachhandles.equals(parentWindow)) {
				driver.switchTo().window(eachhandles);
			}
		}
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		finally
		{
		takeSnap();

		}
	}

	public void acceptAlert() {
		try{
		Alert promtAlert = driver.switchTo().alert();
		trySleep();
		promtAlert.accept();
		System.out.println("Alert Accepted");
		driver.switchTo().defaultContent();
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		
	}

	public void dismissAlert() {

	}

	public String getAlertText() {
		try{
		String strReturn2 = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		return strReturn2;
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser4 does not exists");
		}
		
		return null;
	}

	public void takeSnap() {
	
		try {
			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./snaps/snap" + i + ".jpg");
			FileUtils.copyFile(srcFile, destFile);
			//trySleep();
			i++;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void trySleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void closeBrowser() {
try{
		driver.close();
		System.out.println("The browser is closed");
}
catch(NoSuchElementException e)
{
	System.err.println("Enter by ID failed");
}
catch(WebDriverException e)
{
	System.err.println("Browser does not exists");
}
finally
{
takeSnap();

}
	}

	public void closeAllBrowsers() {
		try{
		driver.quit();
		System.out.println("The browser is closed");
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Enter by ID failed");
		}
		catch(WebDriverException e)
		{
			System.err.println("Browser does not exists");
		}
		

	}

}
