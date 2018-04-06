package org.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollDownClick extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.seleniumhq.org/");
		JavascriptExecutor js = (JavascriptExecutor )driver;
		WebElement footerLogo=driver.findElement(By.id("footerLogo"));
		int xloc = footerLogo.getLocation().getX();
		int yloc = footerLogo.getLocation().getY();
		js.executeScript("window.scrollTo("+xloc+" ,"+yloc+")");
		Thread.sleep(3000);
	}
}
