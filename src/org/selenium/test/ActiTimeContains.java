package org.selenium.test;

import org.openqa.selenium.By;

public class ActiTimeContains extends BaseClass{
	
		public static void main(String[] args) throws InterruptedException {
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(2000);
			String xpath_groupIndex ="(//div[contains(text(),'Login')])[1]";
			driver.findElement(By.xpath(xpath_groupIndex)).click();
		}
	}
