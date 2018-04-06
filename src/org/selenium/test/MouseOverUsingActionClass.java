package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOverUsingActionClass extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.istqb.in/");
		WebElement foundationObj=driver.findElement(By.xpath("//a[text()='FOUNDATION']"));
		Actions action = new Actions(driver);
		action.moveToElement(foundationObj).perform();
		Thread.sleep(2000);
		WebElement enrollmentObj=driver.findElement(By.xpath("//span[text()='ENROLLMENT']"));
		action.moveToElement(enrollmentObj).perform();
		Thread.sleep(2000);
		WebElement corporateEnrollmentObj=driver.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
		action.moveToElement(corporateEnrollmentObj).perform();
		Thread.sleep(2000);
		WebElement OnlineEnrollmentObj=driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']"));
		action.moveToElement(OnlineEnrollmentObj).perform();
		driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
	}
}
