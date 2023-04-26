package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class printAllLinks {
//	static {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	}

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart");
		driver.findElement(By.tagName("a")).click();
		
		
		driver.quit();
	}

}
