package org.selenium.test;

import org.openqa.selenium.By;

public class HiddenDivision_Popup extends BaseClassChrome {

	public static void main(String[] args) {
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.linkText("28")).click();
	}
}
