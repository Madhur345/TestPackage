package org.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
	@FindBy(id="username")
	WebElement unTB;
	@FindBy(name="pwd")
	WebElement pwdTB;
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginBTN;
	public PomLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pwd){
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin(){
		loginBTN.click();
	}
}
