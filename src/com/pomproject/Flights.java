package com.pomproject;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Flights {
	
	
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement sign_in;
	
	public void findAFlaight(String un,String pswd)
	{
		
		
		userName.sendKeys(un);
		
		password.sendKeys(pswd);
		
		sign_in.click();
	}

}
