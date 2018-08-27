package org.selenium.test;

import org.testng.annotations.Test;

public class DemoTestng {

	@Test(priority=1)
	public void createUser(){
		System.out.println("createUser.");
	}
	@Test(priority=2,invocationCount=2,enabled=false)
	public void editUser(){
		System.out.println("editUser.");
	}
	@Test(priority=3,dependsOnMethods="createUser")
	public void deleteUser(){
		System.out.println("deleteUser.");
	}


}
