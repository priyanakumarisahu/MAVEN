package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//launch the empty browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate the zomato application
		driver.get("https://www.zomato.com/");
		//sleep
		Thread.sleep(5000);
		//x-axis getlocation
		int xaxis = driver.findElement(By.xpath("//input[@class='sc-hdPSEv tDCny']")).getLocation().getX();
		//y-axis getlocation
		int yaxis = driver.findElement(By.xpath("//input[@class='sc-hdPSEv tDCny']")).getLocation().getY();
		// print x-axis
		System.out.println(xaxis);
		//print y-axis
		System.out.println(yaxis);
		// sleep
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
