package Testngprogram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class example4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//type casting take screenshoot
		TakesScreenshot t = (TakesScreenshot)driver;
		//to get the take screenshoot method
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshoot1/ss.png");
		Files.copy(src, dest);
		driver.close();
		
	}

}
