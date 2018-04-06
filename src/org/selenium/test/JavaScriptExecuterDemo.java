package org.selenium.test;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecuterDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/textpagenew.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('UN123').value='Selenium'");
	}
}
