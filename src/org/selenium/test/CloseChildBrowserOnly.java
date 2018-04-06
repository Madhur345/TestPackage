package org.selenium.test;

import java.util.Set;

public class CloseChildBrowserOnly extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("total number of browser window is "+count);
		for(String windowHandle : allWindowHandles){
			driver.switchTo().window(windowHandle);
			String title =driver.getTitle();
			if(!windowHandle.equals(parentWindowHandle)){
				driver.close();
				System.out.println("All child browser "+title+" is closed");
			}
		}
	}
}
