package Testngprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class chiku {
	@Test(priority = 2)
	public void Dhoni() {
	
		Reporter.log("Best captain ever in History",true);
	}
	@Test(enabled=false)
	public void sehwag() {
		Reporter.log("Dangerous opener",true);
	}
	@Test(enabled=false)
	public void Ashwin() {
		Reporter.log("offspinner mankanding",true);
	}

}
