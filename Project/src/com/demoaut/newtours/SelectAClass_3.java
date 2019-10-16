package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAClass_3 {
	@FindBy(name="reserveFlights")
	private WebElement submit;
	
	public SelectAClass_3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void selectFlight() {
		submit.click();
	}

}
