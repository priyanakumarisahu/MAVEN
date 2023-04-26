package Testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	// here we use static keyword only inside this class not go any other class
public static  WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database disconnected",true);
	}
	@BeforeTest
	public void launchbrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
		Reporter.log("browser closed",true);
		
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		//pwd text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("logged in successfully",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out",true);
	}
	
	

}




