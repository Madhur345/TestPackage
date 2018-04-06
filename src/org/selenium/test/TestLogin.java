package org.selenium.test;

public class TestLogin extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l = new LoginPage(driver);
		l.setUsername("admin1233");
		l.setPassword("manager1222");
		l.clickLogin();
		Thread.sleep(3000);
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickLogin();
	}
}
