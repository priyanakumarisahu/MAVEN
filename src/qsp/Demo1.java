package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		Thread.sleep(7000);
		driver.close();
	}

}
