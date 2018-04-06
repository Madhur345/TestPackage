package org.selenium.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintValueInSortedOrder_ArrayList extends BaseClass{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
		WebElement xp= driver.findElement(By.id("mtr"));
		ArrayList<String> listObj = new ArrayList<String>();
		Select s= new Select(xp);
		List<WebElement> allOptions =s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement option :allOptions){
			String text = option.getText();
			System.out.println(text);
			listObj.add(text);
		}
		System.out.println("Print In Sorted Order");
		System.out.println(listObj.size());
		for(String text : listObj){
			System.out.println(text);
		}
		driver.close();
	}
}
