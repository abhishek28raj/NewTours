package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_1 {
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement submit;
	
	public LoginPage_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin() {
		username.sendKeys("mercury");
		pass.sendKeys("mercury");
		submit.click();
		
	}
	
	

}
