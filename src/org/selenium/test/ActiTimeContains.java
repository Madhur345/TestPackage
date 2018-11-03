package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeContains extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		System.out.println(password.getAttribute("value"));
		Thread.sleep(2000);
		String xpath_groupIndex ="(//div[contains(text(),'Login')])[1]";
		driver.findElement(By.xpath(xpath_groupIndex)).click();
	}
}
