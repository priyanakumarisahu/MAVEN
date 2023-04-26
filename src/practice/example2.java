package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	
	FileInputStream fis=new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	
	System.out.println(value);
	
}
}
