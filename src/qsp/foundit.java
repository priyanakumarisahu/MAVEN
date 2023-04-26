package qsp;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class foundit {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//navigate the application
				driver.get("https://www.foundit.in/");
				
				//click on upload
	driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
				
		File f = new File("./Testdata/priyanka_sahu.docx");
		String path = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys(path);
		Thread.sleep(4000);
		driver.close();
	}

}
