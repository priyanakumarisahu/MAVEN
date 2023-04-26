package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alllinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		
		//launch the browser
		
//		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate the application
		driver.get("https://www.flipkart.com/");
		//all links size
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		//count alllinks
		int count = alllinks.size();
		//print how many total links in the application
		System.out.println(count);
		//same statement repeat repeat executed 
		for (int i = 0; i < count; i++) {
			String links = alllinks.get(i).getText();
		System.out.println(links);	
			
		
		driver.close();
		

	}

}
}
