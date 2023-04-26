package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
//		below are the line for open the browser
		System.setProperty("webdriver,chrome.driver","./driver/chromedriver.exe");
		
      
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	//   Navigate to Tinder application
		
		driver.navigate().to("https://tinder.com");
		Thread.sleep(4000);
		

	}

}
