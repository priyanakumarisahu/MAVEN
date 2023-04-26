package qsp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectlistbox {
	static {
		System.getProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		//launch the empty browser
				WebDriver driver=new ChromeDriver();
				// maximize the screen
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//navigate to facebook application
				
				driver.get("https://www.facebook.com/");

				//click create new  account button
				
				driver.findElement(By.linkText("Create new account")).click();
				//first name text filed
				Thread.sleep(1000);
				driver.findElement(By.name("firstname")).sendKeys("Priyanka");
				//surname text filed
				Thread.sleep(1000);
				driver.findElement(By.name("lastname")).sendKeys("Panigrahi");
				//email text field
				Thread.sleep(1000);

				driver.findElement(By.name("reg_email__")).sendKeys("priyankakumarisahu95@gmail.com");
				//new password text filed
				Thread.sleep(1000);
				driver.findElement(By.id("password_step_input")).sendKeys("madhu@123");
				Thread.sleep(1000);
				//we need to check in drop down list first class start select and tag should be option
				//Birthday-day(dropdownlist-day1)
				WebElement daydrop = driver.findElement(By.name("birthday_day"));
				//create object
				
				Select s=new Select(daydrop);
				//create class
				
				s.selectByIndex(16);
				
				//Birthday-month(dropdownlist-month2)
				Thread.sleep(1000);
				
				WebElement monthdrop = driver.findElement(By.name("birthday_month"));
				//create object
				
				Select m=new Select(monthdrop);
				//create class
				m.selectByIndex(11);
				//Birthday-year(dropdownlist-year3)
				Thread.sleep(1000);
				
				WebElement yeardrop = driver.findElement(By.name("birthday_year"));
				Select y=new Select(yeardrop);
				//create class here we cant give index we unable to count thats why we use another class selectbyvalue
				y.selectByValue("1995");
				//sleep
				Thread.sleep(2000);
				//close the browser
				driver.close();
	}

}
