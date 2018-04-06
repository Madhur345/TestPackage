
package org.selenium.test;
import java.util.TreeSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDublicateOption  extends BaseClass {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
		WebElement xp =driver.findElement(By.id("mtr"));
		Select s = new Select(xp);
		TreeSet<String> treesetObj = new TreeSet<String>();
		System.out.println("***********Print all values***********");
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement option : allOptions){
			String text =option.getText();
			if(!treesetObj.add(text)){
				System.out.println(text);
			}
		}

		driver.close();
	}
}

