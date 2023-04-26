package Testngprogram;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listenerdesigning.class)
public class snake  extends Baseclass{
	@Test
	public void rat() {
		Assert.fail();
		Reporter.log("snake has swollen the rat",true);
		
		
	}
	@Test
	public void cat() {
	Assert.fail();
		Reporter.log("snake has swollen the rat",true);

}
}
