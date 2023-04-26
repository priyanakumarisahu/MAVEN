package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty("url");
	System.out.println(value);
	driver.get(value);
	String UN = p.getProperty("username");
	String PW = p.getProperty("password");
	driver.findElement(By.id("username")).sendKeys(UN);
	driver.findElement(By.name("pwd")).sendKeys(PW);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[.='Tasks']")).click();
	driver.findElement(By.xpath("//div[.='Add New']")).click();
	driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
	//data present inside xl sheet
	FileInputStream fis1=new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String name = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
	String desc = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
	driver.findElement(By.xpath("//div[.='Create Customer']")).click();
	Thread.sleep(4000);
	driver.close();
	


}


}
