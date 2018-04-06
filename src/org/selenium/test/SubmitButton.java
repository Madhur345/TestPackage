package org.selenium.test;

import org.openqa.selenium.By;

public class SubmitButton extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
}
