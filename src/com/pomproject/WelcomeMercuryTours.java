package com.pomproject;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;



public class WelcomeMercuryTours {
	
	
	//FirefoxDriver driver;
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement flights;
	
	public void flights()
	{
		flights.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void hotels()
	{
		hotels.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement carRentals;
	public void caRentals()
	{
		carRentals.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void cruises()
	{
		cruises.click();
	}
	@FindBy(linkText="Destinations")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement vacations;
	public void vacations()
	{
		vacations.click();
	}
	
	@FindBy(linkText="SIGN-ON")
	WebElement sign_on;
	public void signon()
	{
		sign_on.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void register()
	{
		register.click();
	}	
	
	
	
}
