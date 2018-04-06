package org.selenium.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass{
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	static WebDriver  driver = new FirefoxDriver();
}