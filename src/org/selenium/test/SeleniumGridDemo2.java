
package org.selenium.test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo2 {
	@Test
	public void LaunchFireFoxAndChrome() throws MalformedURLException, InterruptedException{
		URL whichSystem = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities whichbrowser = new DesiredCapabilities();
		whichbrowser.setBrowserName("firefox");
		WebDriver driver = new RemoteWebDriver(whichSystem, whichbrowser);
		driver.get("http://localhost/login.do");
		WebElement un =	driver.findElement(By.id("username"));
		for(int i=1;i<10;i++){
			un.sendKeys("admin"+i);
			Thread.sleep(2000);
			un.clear();
		}
	}
}




