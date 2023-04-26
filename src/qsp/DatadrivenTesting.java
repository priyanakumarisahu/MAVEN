package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatadrivenTesting {
	

	public static void main(String[] args, String url) throws IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
       Properties p=new Properties();
       p.load(fis);
      String url1 = p.getProperty("url");
      driver.get(url1);
      String UN = p.getProperty("username");
      driver.findElement(By.id("username")).sendKeys(UN);
      Thread.sleep(1000);
     String PW = p.getProperty("password");
     driver.findElement(By.name("pwd")).sendKeys(PW);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[.='Login ']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[.='Tasks']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[.='Add New']")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
     Thread.sleep(1000);
     FileInputStream fis1=new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
Workbook wb = WorkbookFactory.create(fis1);
String name = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
Thread.sleep(1000);
String desc = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
Thread.sleep(1000);
driver.findElement(By.xpath("//div[.='Create Customer']")).click();
Thread.sleep(1000);
driver.close();


       
       
	}

}
