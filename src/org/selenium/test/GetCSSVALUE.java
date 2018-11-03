package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class GetCSSVALUE extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String xp_errMsgObj ="//span[contains(text(),'invalid')]";
		WebElement errMsgObj=driver.findElement(By.xpath(xp_errMsgObj));
		System.out.println(errMsgObj.isDisplayed());
		String actualErrorText =errMsgObj.getText();
		System.out.println(actualErrorText);
		String actualColor=errMsgObj.getCssValue("color");
		String backColor =errMsgObj.getCssValue("backgroundcolor");
		System.out.println(backColor);
		System.out.println(actualColor);
		String asHex=Color.fromString(actualColor).asHex();
		String expectedColor="#ce0100";
		if (asHex.equals(expectedColor))
		{
			System.out.println("Error Message In Red");
		}
		else{
			System.out.println("Invalid color");
		}
	}
}
