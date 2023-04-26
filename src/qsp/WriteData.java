package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WriteData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
       Properties p=new Properties();
       p.load(fis);
      String url1 = p.getProperty("url");
      System.out.println(url1);
      driver.get(url1);
      String UN = p.getProperty("username");
      driver.findElement(By.id("username")).sendKeys(UN);
     String PW = p.getProperty("password");
     driver.findElement(By.name("pwd")).sendKeys(PW);
     driver.findElement(By.xpath("//div[.='Login ']")).click();
     driver.findElement(By.xpath("//div[.='Tasks']")).click();
     driver.findElement(By.xpath("//div[.='Add New']")).click();
     driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
     FileInputStream fis1=new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
Workbook wb = WorkbookFactory.create(fis1);
String name = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
String desc = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
driver.findElement(By.xpath("//div[.='Create Customer']")).click();
Thread.sleep(2000);
driver.close();

	}

}
