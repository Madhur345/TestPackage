package org.selenium.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;
public class TestLinkIntegration extends BaseClass {
	public static String DEV_KEY = "611eef349e3b3578fccb55edd2ff8da4"; //Your API 
	public static String SERVER_URL = "http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php"; //your testlink server url
	public static String PROJECT_NAME = "AccoTech"; 
	public static String PLAN_NAME = "Accotech";
	public static String BUILD_NAME = "Build -1";
	@Test
	public void TestOne() throws Exception
	{
		String result = "";
		String exception = null;
		try{
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='577']")).sendKeys("manager");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
			result = TestLinkAPIResults.TEST_PASSED;
			updateTestLinkResult("AT-4", null, result);
		} 
		catch (Exception e){
			result = TestLinkAPIResults.TEST_FAILED;
			exception = e.getMessage();
			updateTestLinkResult("AT-4", exception, result);
		}
	}
	private void updateTestLinkResult(String testCase, String exception, String result) throws TestLinkAPIException{
		TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(DEV_KEY, SERVER_URL);
		testlinkAPIClient.reportTestCaseResult(PROJECT_NAME, PLAN_NAME, testCase, BUILD_NAME, exception, result);
	}
}
