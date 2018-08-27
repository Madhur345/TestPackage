package org.selenium.test;

import java.io.IOException;

import org.openqa.selenium.By;

public class FileUpload_UsingAutoIT extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException, IOException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("//input[@uploader='uploader'][2]")).click();;
		Thread.sleep(1000);
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\VISHAL\\Documents\\FileUpload.exe");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
	}
}
