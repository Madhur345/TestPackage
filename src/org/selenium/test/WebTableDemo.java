package org.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		
		driver.get("file:///C:/Users/VISHAL/Desktop/table.html");
		System.out.println("*******Total Rows****");
		List<WebElement> allrows =driver.findElements(By.xpath("//tr"));
		System.out.println(allrows.size());
		System.out.println("*******Total Columns****");
		List<WebElement> allcolumns =driver.findElements(By.xpath("//th"));
		System.out.println(allcolumns.size());
		System.out.println("*******Total Cells****");
		List<WebElement> allcells =driver.findElements(By.xpath("//td|//th"));
		System.out.println(allcells.size());
		int sum =0;
		for(WebElement cellElement : allcells){
			String text = cellElement.getText();
			try{
				int num=Integer.parseInt(text);
				System.out.println(num);
				sum =sum+num;
			}catch(Exception e){
			}
		}
		System.out.println("sum of all number is : " +sum);
		String xp ="//td[text()='Total']/following-sibling::td";
		String expectedTotal =driver.findElement(By.xpath(xp)).getText();
		System.out.println(expectedTotal);

		List<WebElement> allPrices =driver.findElements(By.xpath("(//td[3])[position()!=last()]"));
		int actualTotal=0;
		for(WebElement element : allPrices){
			String price = element.getText();
			int actualPrice =Integer.parseInt(price);
			actualTotal=actualTotal+actualPrice;
		}
		if (Integer.parseInt(expectedTotal)==actualTotal){
			System.out.println("Total Price is dispalyed Correctly");
		}
		else{
			System.out.println("Incorrect Total Price");
		}
		driver.close();
	}

}
