package org.selenium.test;

//public class Print_windowHandle extends BaseClass {
public class Print_windowHandle extends BaseClassChrome {
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
	}
}
