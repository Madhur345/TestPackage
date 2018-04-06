package org.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick_UsingContextClickMethod extends BaseClassChrome {

	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement linkObj=driver.findElement(By.linkText("actiTIME Inc."));
		Actions action = new Actions(driver);
		action.contextClick(linkObj).perform();
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
		driver.close();
	}
}
