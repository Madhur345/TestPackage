package org.selenium.test;

import java.util.Set;

public class ChildBrowserPopUp extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		//using getWindowHandles(), get a set of window handle IDs
		Set<String> allWindowHandles = driver.getWindowHandles();
		//using size(), get the count of total number of browser windows
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		// you can pass a “window handle” to the “switchTo().window()” method. Knowing this, it’s possible to iterate over every open window like so:
		for (String windowHandle : allWindowHandles) {
			//switch to each browser window
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			//print the window handle id of each browser window
			System.out.println("Window handle id of page -->"+ title +" -->  is : "+windowHandle);
			//close all the browsers one by one
			//driver.close();
		}
	}
}
/*Instead of using driver.close(), we can use driver.quit() to close all the browsers at once*/
//driver.quit(); 
