package splClass15Aug2017;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.iupui.edu/~webtrain/tutorials/tables.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement table=driver.findElementByXPath("/html/body/div[6]/table");
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("The no of rows: "+rows.size());
		List<WebElement> cols=table.findElements(By.tagName("td"));
		System.out.println("The no of cols: "+cols.size());
		
		driver.close();

	}

}
