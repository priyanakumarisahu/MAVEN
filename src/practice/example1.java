package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty("url");
	System.out.println(value);
	driver.get(value);
//	String UN = p.getProperty("username");
//	String PW = p.getProperty("password");
//	driver.findElement(By.id("username")).sendKeys(UN);
//	driver.findElement(By.name("pwd")).sendKeys(PW);
//	driver.findElement(By.xpath("//div[.=\"Login \"]")).click();
//	driver.close();
	}

}
