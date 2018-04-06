package org.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends BaseClass {
	@Test
	public void testLogin(){
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();

		//String expectedTitle ="actitime home page";
		String expectedTitle="actiTIME - Enter Time-Track123";
		try{
			WebDriverWait wait =new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(expectedTitle));
		}catch(Exception e){
		}

		String actualTitle =driver.getTitle();
		//Assert.assertEquals(expectedTitle,actualTitle);

		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedTitle,actualTitle);
		driver.close();
		s.assertAll();

	}

}
