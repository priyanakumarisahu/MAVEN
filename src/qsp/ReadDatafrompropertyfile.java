package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadDatafrompropertyfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		FileInputStream fis=new FileInputStream("./Testdata/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty("url");
		System.out.println(value);
		driver.get(value);
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
