package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframe1 {
	static {
		
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("Q");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.name("n2")).sendKeys("J");
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("S");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.name("n2")).sendKeys("S");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("P");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		driver.findElement(By.name("n2")).sendKeys("P");
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		

	}

}
