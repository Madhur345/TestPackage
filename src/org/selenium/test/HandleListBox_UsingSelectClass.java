package org.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox_UsingSelectClass extends BaseClass {

	public static void main(String[] args) {
driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
WebElement xp =driver.findElement(By.id("mtr"));
Select s = new Select(xp);
List<WebElement> allOptions = s.getOptions();
System.out.println(allOptions.size());
for(WebElement option : allOptions){
	String text =option.getText();
	
	System.out.println(text);
}
s.selectByIndex(0);
s.selectByValue("v");
s.deselectByVisibleText("Poori");   

	}

}
