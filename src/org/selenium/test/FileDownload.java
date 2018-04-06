package org.selenium.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
public class FileDownload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "D:\\SeleniumNotes");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
		Thread.sleep(3000);
	}
}
