package com.pomproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state_Province;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement userNameReg;
	
	@FindBy(name="password")
	WebElement passwordReg;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="register")
	WebElement submit;
	
	public void registerTest()
	{
		firstName.sendKeys("Pichaiah");
		lastName.sendKeys("Surname");
		phone.sendKeys("9753186240");
		email.sendKeys("pichaiah@mymail.com");
		address.sendKeys("Pittaipalem");
		city.sendKeys("Nocity");
		state_Province.sendKeys("USP");
		postalCode.sendKeys("044521");
		country.sendKeys("UNITED STATES");
		userNameReg.sendKeys("pichaiah");
		passwordReg.sendKeys("surname");
		confirmPassword.sendKeys("surname");
		submit.click();
	}

}
