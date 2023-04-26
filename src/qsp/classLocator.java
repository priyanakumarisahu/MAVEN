package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classLocator {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Demo.html");
//		driver.manage().window().maximize();
		driver.findElement(By.className("c1")).click();
		Thread.sleep(5000);
		driver.close();
	

	}

}
