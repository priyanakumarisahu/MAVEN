package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver,chrome.driver","./driver/chromedriver.exe");
		ChromeDriver mumbai=new ChromeDriver();
		mumbai.manage().window().maximize();
		Thread.sleep(4000);
		mumbai.get("https://www.flipkart.com");
		String title=mumbai.getTitle();
		System.out.println(title);
		
		mumbai.quit();
		
		
	}

}
