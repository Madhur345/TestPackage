package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintTooltip_Actitime_RememberCheckbox extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		//find the Keep me Logged in Checkbox
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//get the tooltip text using getAttribute() method and store in a variable
		String tooltipText = Checkbox.getAttribute("title");
		System.out.println(tooltipText);
	}}


