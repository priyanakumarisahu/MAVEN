package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectmultiselectlistbox {
	static {
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//navigate to Qspider%20Restaurant  application
				driver.get("file:///C:/Users/DELL/Desktop/Qspider%20Restaurant.html");
				WebElement Menu = driver.findElement(By.id("hotel Menu"));
				Select s=new Select(Menu);
				Thread.sleep(1000);
				s.selectByIndex(0);
				Thread.sleep(1000);
				s.selectByIndex(1);
				Thread.sleep(1000);
				s.selectByIndex(2);
				Thread.sleep(1000);
				s.selectByIndex(3);
				Thread.sleep(1000);
				s.selectByIndex(4);
				Thread.sleep(1000);
				s.selectByIndex(5);
				Thread.sleep(1000);
				s.deselectByIndex(0);
				Thread.sleep(1000);
				s.deselectByIndex(1);
				Thread.sleep(1000);
				s.deselectByIndex(2);
				Thread.sleep(1000);
				driver.close();

	}

}
