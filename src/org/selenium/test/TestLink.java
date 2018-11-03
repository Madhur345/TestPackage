package org.selenium.test;

import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;

public class TestLink extends BaseTestLnk {
	String PLAN_NAME="Acootech";
	String BUILD_NAME ="Build -1";
	String TEST_CASE="At-4";
	@Test
	public  void testLink() throws TestLinkAPIException{
		try{
			reportTestResultPass(PLAN_NAME, TEST_CASE, BUILD_NAME);
		}catch(Exception e){
			reportTestResultFail(PLAN_NAME,TEST_CASE, BUILD_NAME, e);
		}
	}
}

