package org.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoIT extends BaseClass{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		Runtime run =Runtime.getRuntime();
		run.exec("C:\\Users\\VISHAL\\Documents\\CancelOnPrintWindow.exe");
	}

}

