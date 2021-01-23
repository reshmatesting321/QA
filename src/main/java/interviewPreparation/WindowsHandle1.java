package interviewPreparation;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
public class WindowsHandle1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.gcflearnfree.org/windows10/tips-for-managing-multiple-windows/1/");
	/* Scenario 1: From parent window, opening 2 child windows, switching to each child window
		 * and do some operation come back to parent window and finally closing all windows. */
		driver.get("http://www.businessinsider.in/clusterstock");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
		String s=driver.getCurrentUrl();
		String s1=driver.getTitle();
		System.out.println("Parent Window "+ s);
		driver.findElementByXPath("//*[text()='Events']").click();
		// driver.switchTo().defaultContent();
		 Set<String> winH=driver.getWindowHandles();
		 for(String eachH:winH)
		 {
			 if(!parentWindow.equals(eachH))
			 {driver.switchTo().window(eachH);
			
				 driver.findElementByXPath("//*[@id='big_box']/p[2]/strong/a").click(); //do some operation
				 System.out.println("HI");		//do some operation	 
			
			 }
		 }
		 String getCh1=driver.getWindowHandle();
		 driver.switchTo().window(parentWindow);
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//*[text()='Bi intelligence']").click(); //clicking the 2nd link
		//driver.findElementByXPath("//*[text()='Bi intelligence']").getAttribute("value");
		// driver.findElementByLinkText("Bi intelligence").click();
		 Set<String> TwoChWin=driver.getWindowHandles();
		 for(String Win:TwoChWin)
		 { System.out.println(Win);
		 if(!Win.equals(parentWindow) && !Win.equals(getCh1))
		 {
		 driver.switchTo().window(Win);
			 
					 driver.findElementByXPath("//*[@id='reports-store-link']/a").click(); //do some operation
					 System.out.println("WELCOME");//do some operation
				 }
		 }
		/* Scenario 2: From parent window, going to first child window, gold , doing operations like 
		 * clicking another link is opening another child window and finally closing all windows. 
		driver.get("http://www.sify.com/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentWindow=driver.getWindowHandle();
		String s=driver.getCurrentUrl();
		String s1=driver.getTitle();
		System.out.println("Parent Window "+ s);
		 driver.findElementByXPath("//*[text()='Gold Rates']").click();
			Set<String> twoWin=driver.getWindowHandles();
	 System.out.println("Parent and child-1 Window size "+twoWin.size());
		for(String chWin1:twoWin)
		{
			if(!chWin1.equals(parentWindow))
			{System.out.println(chWin1);
				driver.switchTo().window(chWin1);
				System.out.println("Child1 Window "+driver.getTitle());
				driver.findElementByXPath("//*[text()='Astrology']").click();
				
				Set<String> threeWin=driver.getWindowHandles();
				System.out.println("Parent and child-2 Window size "+threeWin.size());
				for(String chWin2:threeWin)
				{
					if(!twoWin.contains(chWin2))
					{System.out.println(chWin2);
						driver.switchTo().window(chWin2);
						System.out.println("Child2 Window "+driver.getTitle());
						driver.switchTo().window(parentWindow);
					}
				}
				
			}
			
		}
 */
//driver.close();


	}

}
/*
 Lets say you are already working with two windows and now you want to click a link which will 
 open third window and you want to switch on third window: I have written a simple logic and its 
 working................ Pass the WebElement where you want to click..............

public static void switchToWindow(WebElement ele)
    {
        try {
            Set<String> OldAllWindows = GenericMethods.driver.getWindowHandles();
            ele.click();
            Set<String> NewAllWindows = GenericMethods.driver.getWindowHandles();
            for(String newWindow : NewAllWindows)
            {
                if(!OldAllWindows.contains(newWindow))
                {
                    GenericMethods.driver.switchTo().window(newWindow);
                }
            }

            //  
        } catch (Exception e) {
            System.out.println("Issue in Switching Window"+e.getMessage());
        }

    }
    */
