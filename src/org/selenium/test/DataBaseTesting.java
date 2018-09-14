package org.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class DataBaseTesting extends BaseClass{
	@Test
	public void testLogin() throws SQLException, InterruptedException{
		ERPLoginPage l = new ERPLoginPage(driver);
		driver.get("http://tpod.accotech.xyz/erp_squareplums/index.html#/login");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=	DriverManager.getConnection("jdbc:mysql://95.216.7.84:3306/master","root","P@88w0rd");
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from int_um_user where user_id=784");
			while(rs.next()){
				String usename =rs.getString(6);
				String password =rs.getString(2);
				l.setUserName(usename);
				l.setPassword(password);
			}
		}catch(ClassNotFoundException e){
		}
		Thread.sleep(2000);
		String expectedTitle ="SquarePlums ERP";
		String actualTitle =driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.println("expected title is :"+expectedTitle);
		System.out.println("actual title is :"+actualTitle);
		s.assertAll();
		driver.close();
	}
}
