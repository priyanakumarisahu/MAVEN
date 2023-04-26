package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledmethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		Thread.sleep(5000);
      boolean button = driver.findElement(By.name("login")).isEnabled();
    //if -else condition
    		if (button==true) {
    			System.out.println("button is Enabled");
    			
    		} else {
    			System.out.println("button is not Enabled");
      
	
    		driver.close();

}
	}
}


