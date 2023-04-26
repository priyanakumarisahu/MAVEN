package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	//launch the empty browser
		WebDriver driver=new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		//implicit wait syntax
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// navigate to actitime application
		driver.get("https://demo.actitime.com/login.do");
		//enter user name text field
		driver.findElement(By.name("username")).sendKeys("admin");
		//enter pwd text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//logout button
		driver.findElement(By.id("logoutLink")).click();
		
		//close the browser
		driver.close();

	}

}
