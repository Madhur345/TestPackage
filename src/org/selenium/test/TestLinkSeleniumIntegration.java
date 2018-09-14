package org.selenium.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class TestLinkSeleniumIntegration extends BaseClass {
	public static String DEV_KEY="611eef349e3b3578fccb55edd2ff8da4";
	public static String SERVER_URL ="http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php";
	public static String PROJECT_NAME ="AccoTech";
	public static String PLAN_NAME ="Accotech";
	public static String BUILD_NAME ="Build -1";

@Test
	public void testOne() throws Exception{
		String result ="";
		String execNotes="null";
		try{
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='er56']")).sendKeys("manager");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
			
			result	=TestLinkAPIResults.TEST_PASSED;
			execNotes ="Test case Excecuted Successfully";
			updateTestLinkResult("AT-4", execNotes, result);
		}catch(Exception e){
			result =TestLinkAPIResults.TEST_FAILED;
			execNotes = "Test case Excecution Failed because  "+e.getMessage();
			updateTestLinkResult("AT-4", execNotes, result);
		}
	}
	private void updateTestLinkResult(String testCaseName, String execNotes, String result) throws TestLinkAPIException{
		TestLinkAPIClient testlink = new TestLinkAPIClient(DEV_KEY, SERVER_URL);
		testlink.reportTestCaseResult(PROJECT_NAME, PLAN_NAME, testCaseName, BUILD_NAME, execNotes, result);
		driver.quit();
	}
	
}
