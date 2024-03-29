package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmation_5 {
	@FindBy(css="body > div:nth-child(1) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody >"
			+ " tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")
	private WebElement sucessMessage;
	
	public FlightConfirmation_5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSucessMessage() {
		return sucessMessage;
	}

	
	
	

}
