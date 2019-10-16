package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight_4 {
	@FindBy(name="passFirst0")
	private WebElement firstName; 
	
	@FindBy(name="passLast0")
	private WebElement lastName; 
	
	@FindBy(name="creditnumber")
	private WebElement ccNumber; 
	
	@FindBy(name="buyFlights")
	private WebElement submit; 
	
	public BookAFlight_4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void BookFlight() {
		firstName.sendKeys("Abhishek");
		lastName.sendKeys("Raj");
		ccNumber.sendKeys("123456");
		submit.click();
	}

}
