package org.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT_Example {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		//Press Control + P from keyboard using Robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//Using Runtime class, to run the .exe file
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\VISHAL\\Documents\\CancelOnPrintWindow.exe");
		//close the browser 
		//driver.close();
	}
}
