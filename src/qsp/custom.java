package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom {
	static {
		System.getProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
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
		//custom synchronization own program written
		int i=0;
		while (i<1000) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				
			} catch (Exception e) {
				i++;
			}
			
		}
		//close the browser
		driver.close();
			
		}

	}


