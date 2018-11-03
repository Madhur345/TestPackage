package org.selenium.test;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class BaseTestLnk {
	static String PROJECT_NAME="ACCOTECH";
	static String DEV_KEY ="2893030302";
	static String SERVER_URL="testlink.com";
	

	public static  void updateTestLinkResult(String planName,String testCase,String buildName,String execNotes,String result ) throws TestLinkAPIException{
		TestLinkAPIClient testlink = new TestLinkAPIClient(DEV_KEY, SERVER_URL);
		testlink.reportTestCaseResult(PROJECT_NAME, planName, testCase, buildName, execNotes, result);
	}
	public static void reportTestResultPass(String planName,String testCase,String buildName) throws TestLinkAPIException{
		String result = TestLinkAPIResults.TEST_PASSED;	
		String execNotes ="Testcase Executed Successfully";
		updateTestLinkResult(planName, testCase, buildName, execNotes, result);
	}
	public static void reportTestResultFail(String planName,String testCase,String buildName,Exception e) throws TestLinkAPIException{
		String result = TestLinkAPIResults.TEST_FAILED;	
		String execNotes ="Testcase Failed because" + e.getMessage();
		updateTestLinkResult(planName, testCase, buildName, execNotes, result);
	}
}