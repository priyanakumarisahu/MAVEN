//	WRITE A SCRIPT TO CLICK ON FLIPKART LINK BY USING TAGNAME LOCATOR


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Demo.html");
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(6000);
		
		driver.quit();
		
		
			
			
		}
		
		

	
}


