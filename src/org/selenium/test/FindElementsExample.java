package org.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsExample extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on web page is :" +totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount =0;
		for(WebElement link: allLinks){
			if(link.isDisplayed()){
				visibleLinkCount++;
				System.out.println(visibleLinkCount+"---->"+link.getText());
			}
			else{
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible link :" +visibleLinkCount);
		System.out.println("Total number of hidden link :" +hiddenLinkCount);
		driver.close();
	}
}

