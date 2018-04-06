package org.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassChrome {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	static WebDriver  driver = new ChromeDriver();
}

