package org.selenium.test;

import java.util.Set;

public class ChildBrowser_PopUp extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		Set <String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Total number of browser window is :" + count);
		for(String windowHandle : allWindowHandles){
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Window handle id of the page :"+title+"is:"+windowHandle);
			driver.close();
		}
	}
}


