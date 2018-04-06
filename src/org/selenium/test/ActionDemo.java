package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.istqb.in/");

		WebElement foundationObj=driver.findElement(By.xpath("//span[text()='FOUNDATION']"));
		Thread.sleep(1000);
		WebElement enrollmentObj=driver.findElement(By.xpath("//span[text()='ENROLLMENT']"));
		Thread.sleep(1000);
		WebElement corporateEnrollmentObj=driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
		Thread.sleep(1000);
		WebElement OnlineEnrollmentObj=driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']"));
		Actions action = new Actions(driver);
		action.moveToElement(foundationObj).moveToElement(enrollmentObj).moveToElement(corporateEnrollmentObj)
		.moveToElement(OnlineEnrollmentObj).build().perform();
	}
}





