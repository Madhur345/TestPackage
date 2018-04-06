package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFacebook extends BaseClassChrome {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.facebook.com");
		WebElement unObj = driver.findElement(By.id("email"));
		unObj.sendKeys("madhurvishal5@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys(".v9661132");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[id='u_0_2']")).click();
	}
}