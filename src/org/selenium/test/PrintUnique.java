package org.selenium.test;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintUnique extends BaseClass{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
		WebElement xp= driver.findElement(By.id("mtr"));
		TreeSet<String> treeObj = new TreeSet<String>();
		Select s= new Select(xp);
		List<WebElement> allOptions =s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement option :allOptions){
			String text = option.getText();
			System.out.println(text);
			if(!treeObj.add(text)){
				System.out.println("print only duplicate value");
				System.out.println(text);
			}
		}
		driver.close();
	}
}
