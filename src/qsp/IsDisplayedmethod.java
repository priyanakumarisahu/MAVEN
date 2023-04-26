package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedmethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		//launch the empty browser
		WebDriver driver=new ChromeDriver();
		// maximize 
		driver.manage().window().maximize();
		//navigate facebook application
		driver.get("https://www.facebook.com/");
		//isdisplayed or not
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		//if -else condition
		if (logo==true) {
			System.out.println("Logo is displayed");
			
		} else {
			System.out.println("Logo is not displayed");

		}
		//close the browser
		driver.close();
	}

}
