package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.close();

	}

}
//priyanka sahu 