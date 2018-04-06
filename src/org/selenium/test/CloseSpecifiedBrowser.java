package org.selenium.test;
import java.util.Set;

public class CloseSpecifiedBrowser extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String expectedTitle ="Amazon";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("total number of browser window is "+count);
		for(String windowHandle : allWindowHandles){
			driver.switchTo().window(windowHandle);
			String actualTitle =driver.getTitle();
			if(actualTitle.contains(expectedTitle)){
				driver.close();
				System.out.println("Specified Browser "+actualTitle+" is closed");
			}
		}
	}
}

