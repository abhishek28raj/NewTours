package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindAFlight_2 {
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=radio]:nth-child(2)")
	private WebElement businessClass;
	
	
	@FindBy(xpath=".//*[@name='airline']")
	private WebElement airline;
	
	@FindBy(name="findFlights")
	private WebElement submit;
	
	public FindAFlight_2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void FindFlight() {
		businessClass.click();
		Select selectn = new Select(airline);
		selectn.selectByIndex(1);
		submit.click();
	}

}
