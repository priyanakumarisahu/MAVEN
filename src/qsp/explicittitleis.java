package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicittitleis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//launch the empty browser
				WebDriver driver=new ChromeDriver();
				// maximize the screen
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				//enter user name text field
				driver.findElement(By.name("username")).sendKeys("admin");
				//enter pwd text field
				driver.findElement(By.name("pwd")).sendKeys("manager");
				//login button
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				//explicit wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//title
//				wait.until(ExpectedConditions.titleContains("Enter"));
				//logout button
				driver.findElement(By.id("logoutLink")).click();
				
				//close the browser
				driver.close();
	}

}
