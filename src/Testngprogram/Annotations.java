package Testngprogram;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database disconnected",true);
	}
	@AfterSuite
	public void databasedisconnected() {
		Reporter.log("database disconnected",true);
	}
	@BeforeTest
	public void launchbrowser() {
		Reporter.log("browser launched",true);
	}
	@AfterTest
	public void closebrowser() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser closed",true);
		
	}
	@BeforeMethod
	public void login() {
		Reporter.log("logged in",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("log out successfully",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("customer created",true);
	}

}
