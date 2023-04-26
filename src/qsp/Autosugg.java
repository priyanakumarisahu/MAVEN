package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("oneplus 10r");
		Thread.sleep(5000);
		List<WebElement> allsugg=driver.findElements(By.xpath("//span[@class='r85cly']/.."));
		int count = allsugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String sugg = allsugg.get(i).getText();
			System.out.println(sugg);
		}
		driver.close();

	}

}
	
