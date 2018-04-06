package org.selenium.test;

public class PomTestLogin extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		PomLoginPage login = new PomLoginPage(driver);
		login.setUserName("manager233");
		login.setPassword("adminsaksk");
		login.clickLogin();
		Thread.sleep(3000);
		login.setUserName("admin");
		login.setPassword("manager");
		login.clickLogin();
	}
}
