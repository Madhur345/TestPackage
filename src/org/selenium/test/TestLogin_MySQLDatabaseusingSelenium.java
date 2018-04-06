package org.selenium.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.testng.asserts.SoftAssert;

public class TestLogin_MySQLDatabaseusingSelenium extends BaseClass{
    @Test
    public void testLogin() throws InterruptedException, SQLException{
   	 ERPLoginPage l = new ERPLoginPage(driver);
   	 driver.get("http://perp.accotech.xyz/#/login");
   	 try {
   		 Class.forName("com.mysql.jdbc.Driver");
   		 Connection con = DriverManager.getConnection("jdbc:mysql://95.216.7.84:3306/master", "root", "P@88w0rd");
   		 Statement stmt = con.createStatement();
   		 ResultSet rs = stmt.executeQuery("SELECT * FROM int_um_user where user_id=784");
   		 while (rs.next()) {
   			 String username = rs.getString(6); // 1 refers to the first column
   			 String password = rs.getString(2);
   			 l.setUserName(username);
   			 l.setPassword(password);
   			 l.clickLogin();
   		 }
   	 } catch (ClassNotFoundException e) {
   	 }
   	Thread.sleep(10000);
   	     String expectedTitle ="SquarePlums ERP";
    String actualTitle = driver.getTitle();
   	 SoftAssert s = new SoftAssert();
   	 s.assertEquals(actualTitle, expectedTitle);
   	 s.assertAll();
    }
}
