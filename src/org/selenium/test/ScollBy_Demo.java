package org.selenium.test;

import org.openqa.selenium.JavascriptExecutor;

public class ScollBy_Demo extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.seleniumhq.org/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		for(int i=0;i<5;i++){
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500)");
		}
		for(int i =0;i<5;i++){
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
}
