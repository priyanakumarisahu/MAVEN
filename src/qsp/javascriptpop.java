
//write a script to handle Alert popup
package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpop {
	static {
		System.getProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//navigate the application
		driver.get("https://demo.actitime.com/login.do");
		//user name text field
		driver.findElement(By.id("username")).sendKeys("admin");
		//pwd text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//click on task
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		//add new button
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		//new customer
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		//enter customer name
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("QSPIDER THANE");
		
		//cancel button
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(5000);
		//syntax of alert popup
		Alert a = driver.switchTo().alert();
		//alert class method accept
		a.accept();
		Thread.sleep(5000);
		//close the browser
		driver.close();
		


	}

}
