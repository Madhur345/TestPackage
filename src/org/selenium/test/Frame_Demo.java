package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame_Demo extends BaseClass {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/Frame_page2.html");
		//driver.switchTo().frame("f1");
		WebElement frameObj=driver.findElement(By.xpath("//iframe[@src='Frame_Page1.html']"));
		driver.switchTo().frame(frameObj);
		driver.findElement(By.id("t1")).sendKeys("Vishal");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("Madhur");
	}
}
