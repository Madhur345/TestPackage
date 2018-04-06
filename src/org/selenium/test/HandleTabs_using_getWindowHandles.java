package org.selenium.test;

import java.util.Set;

import org.openqa.selenium.By;

public class HandleTabs_using_getWindowHandles extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		String parentwindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> allwhs = driver.getWindowHandles();
		int count = allwhs.size();
		System.out.println("total number of browser window is "+count);
		for (String wh : allwhs) {
			driver.switchTo().window(wh);
			driver.switchTo().window(parentwindowHandle);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(20000);
			driver.quit();
		}
	}
}
