package Testngprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1 {
	@Test(priority = 3)
	public void priyanka() {
		Reporter.log("nice");
	}
	@Test(enabled = true)
	public void madhu() {
		Reporter.log("nice");
	}
	@Test(priority = 1)
	public void pihu() {
		Reporter.log("nice");
	}
	

}
