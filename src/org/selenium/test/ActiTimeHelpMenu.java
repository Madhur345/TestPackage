package org.selenium.test;

import org.openqa.selenium.By;

public class ActiTimeHelpMenu extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About your actiTIME")).click();;
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("(//span[contains(text(),'actiTIME')])[1]")).getText();
		System.out.println(text);
	}
}
