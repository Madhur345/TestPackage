package org.selenium.test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox extends BaseClass {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/list.html");
		WebElement xp =driver.findElement(By.id("mtr"));
		Select s = new Select(xp);
		List<WebElement> allOptions = s.getOptions();
		int total =allOptions.size();
		System.out.println("Total options in the list box :" +total);
		for(WebElement list : allOptions){
			String text = list.getText();
			System.out.println(text);
		}
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println("Total selected options are " +s.getAllSelectedOptions().size());
		for(WebElement allSelectedOptions :options){
			String text1 = allSelectedOptions.getText();
			System.out.println(text1);
		}
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple =s.isMultiple();
		System.out.println(multiple+ " Yes list box is multiselected");
		if(multiple){
			WebElement firstSelectedOption1 = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText()+" is the first selected item");
			//s.deselectAll();
			s.deselectByIndex(0);
			WebElement firstSelectedOption2 = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText()+" is the first selected item");
			s.deselectByValue("v");
			WebElement firstSelectedOption3 = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption3.getText()+" is the first selected item");
			s.deselectByVisibleText("Poori");
			driver.close();
		}
	}
}
