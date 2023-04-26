package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframe {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/DELL/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("QSP");
		driver.switchTo().frame(0);
		driver.findElement(By.name("n2")).sendKeys("JSP");
		Thread.sleep(2000);
		driver.close();
	}

}
