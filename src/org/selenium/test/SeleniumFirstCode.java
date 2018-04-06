package org.selenium.test;
import org.openqa.selenium.WebDriver.Navigation;

public class SeleniumFirstCode extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		Navigation nav = driver .navigate();
		nav.to("http://www.google.com");
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
	}
}
