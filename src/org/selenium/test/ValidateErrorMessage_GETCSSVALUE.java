package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ValidateErrorMessage_GETCSSVALUE extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String xp_errMsg ="//span[contains(text(),'invalid')]";
		WebElement errorMsgObj = driver.findElement(By.xpath(xp_errMsg));
		System.out.println(errorMsgObj.isDisplayed());
		String actualErrorText = errorMsgObj.getText();
		System.out.println(actualErrorText);
		String actualColourValue = errorMsgObj.getCssValue("color");
		System.out.println(actualColourValue);
		String expectedColourValue ="#ce0100";
		String colorAsHex =Color.fromString(actualColourValue).asHex();
		if(colorAsHex.equals(expectedColourValue)){
			System.out.println("error msg in Red Color");
		}
		else{
			System.out.println("Invalid color");
		}

	}
}

//#ce0100