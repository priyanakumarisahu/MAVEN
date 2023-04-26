package Testngprogram;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class program4 {
	@Test(priority = 2)
	public void Dhoni() {
	
		Reporter.log("Best captain ever in History",true);
	}
	@Test(priority = 2)
	public void sehwag() {
		Reporter.log("Dangerous opener",true);
	}
	@Test(priority = 3)
	public void Ashwin() {
		Reporter.log("offspinner mankanding",true);
	}

}


