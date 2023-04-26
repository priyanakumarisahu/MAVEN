package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robochitii {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("Notepad");
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_U);
		Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_N);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_I);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_L);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_P);
	    Thread.sleep(1000);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_R);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_Y);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_K);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
