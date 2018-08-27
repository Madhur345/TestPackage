package org.selenium.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG2 {
	


		@Test(priority=1,dependsOnMethods="deleteUser")
		public void createUser(){
			System.out.println("createUser.");
			Assert.fail();
		}
		@Test(priority=2,invocationCount=2)
		public void editUser(){
			System.out.println("editUser.");
		}
		@Test(priority=3,dependsOnMethods="createUser")
		public void deleteUser(){
			System.out.println("deleteUser.");
		}
	}

