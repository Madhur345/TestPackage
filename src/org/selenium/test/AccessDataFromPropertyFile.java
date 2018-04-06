         package org.selenium.test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccessDataFromPropertyFile extends BaseClass {
	@Test
	public void pripertyFileDemo() throws IOException, InterruptedException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./ConfigNew.properties");
		prop.load(fis);
		String url=prop.getProperty("URL");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(url);
		System.out.println(username+":"+password);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
