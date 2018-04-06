package org.selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot_ActitimeLogin extends BaseClass {
	public static void main(String[] args) throws IOException {
		Date d = new Date();
		String date1=d.toString();
		System.out.println(date1);
		String date2 = date1.replaceAll(":","_");
		System.out.println(date2);
		driver.get("http://localhost/login.do");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File dstFile = new File(".\\Screenshots\\"+date2+"_actitmelogin.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.close();

	}

}
