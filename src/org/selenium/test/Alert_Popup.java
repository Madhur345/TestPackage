package org.selenium.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_Popup extends BaseClassChrome{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("loginbutton" )).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
	}
}
