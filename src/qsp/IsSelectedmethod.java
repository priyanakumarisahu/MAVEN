package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedmethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//isselected or not
				boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
				//if -else condition
				if (checkbox==true) {
					System.out.println("checkbox is selected");
					
				} else {
					System.out.println("checkbox is not selected");

	}
				driver.close();

}
}
