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

public class example4 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//file path setup
		FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
		//property file object create
		Properties p=new Properties();
		//load the class inside property files
		p.load(fis);
		String URL = p.getProperty("url");
		System.out.println(URL);
		driver.get(URL);
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		
		//collect data from external file excel
		FileInputStream fis1=new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String name = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(name);
	
		
		

	}

}
