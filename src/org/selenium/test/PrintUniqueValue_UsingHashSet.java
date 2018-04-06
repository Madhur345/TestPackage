package org.selenium.test;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueValue_UsingHashSet extends BaseClass {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
		WebElement xp =driver.findElement(By.id("mtr"));
		Select s = new Select(xp);
		HashSet<String> hashsetObj = new HashSet<String>();
		System.out.println("***********Print all values***********");
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement option : allOptions){
			String text =option.getText();
			System.out.println(text);
			hashsetObj.add(text);
		}
		System.out.println("***********Print only unique values***********");
		System.out.println(hashsetObj.size());
		for(String text : hashsetObj){
			System.out.println(text);
		}
		driver.close();
	}
}
