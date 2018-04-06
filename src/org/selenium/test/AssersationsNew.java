package org.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssersationsNew extends BaseClass {
	@Test
	public static void testLoginNew(){

		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();

		String expectedTitle ="actiTIME - Enter Time-Track";
		try{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.titleIs(expectedTitle));
		}catch(Exception e){
		}
		String actualTitle =driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		driver.close();
		s.assertAll();
	}
}
