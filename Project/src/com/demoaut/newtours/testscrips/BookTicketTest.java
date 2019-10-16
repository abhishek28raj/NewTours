package com.demoaut.newtours.testscrips;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.BookAFlight_4;
import com.demoaut.newtours.FindAFlight_2;
import com.demoaut.newtours.FlightConfirmation_5;
import com.demoaut.newtours.LoginPage_1;
import com.demoaut.newtours.SelectAClass_3;

public class BookTicketTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.newtours.demoaut.com/");
//	WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println();
	}
	
	@Test
	public void TicketBookingTest() {
		LoginPage_1 login = new LoginPage_1(driver);
		login.applicationLogin();
		FindAFlight_2 flight = new FindAFlight_2(driver);
		flight.FindFlight();
		
		SelectAClass_3 SelectA = new SelectAClass_3(driver);
		SelectA.selectFlight();
		
		BookAFlight_4 book = new BookAFlight_4(driver);
		book.BookFlight();
		
		FlightConfirmation_5 confirm = new FlightConfirmation_5(driver);
		
		
		String expectedMessage="Your itinerary has been booked!";
		String actualMessage= confirm.getSucessMessage().getText();
		Assert.assertEquals(actualMessage, expectedMessage);
		}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
