package org.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Google_Search extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int totalOptions = allOptions.size();
		System.out.println("Total Options are :" + totalOptions);
		for(WebElement options : allOptions){
			String text = options.getText();
			System.out.println(text);
			if(text.equals("selenium maven dependency")){
				options.click();
				break;
			}
		}
	}
}
