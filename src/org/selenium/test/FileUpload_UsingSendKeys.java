package org.selenium.test;

import org.openqa.selenium.By;

public class FileUpload_UsingSendKeys  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		String fileFath ="C:\\Users\\VISHAL\\Desktop\\0 dashboard.png";
		String xp ="//input[@type ='file'][2]";
		driver.findElement(By.xpath(xp)).sendKeys(fileFath);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
	}
}
