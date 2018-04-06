package org.selenium.test;

import org.openqa.selenium.By;

public class HandlingDynamicElements extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='3.9.1']"));
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
	}
}
