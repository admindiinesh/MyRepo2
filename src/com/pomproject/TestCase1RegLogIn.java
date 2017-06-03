package com.pomproject;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1RegLogIn {
	
	@Parameters("browser")
	@Test
	public void RegisterTest(String b) throws Exception
	{
		DesiredCapabilities caps=null;
		if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "52.0");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "OS X 10.11");
			caps.setCapability("version", "9.0");
		}
		String USERNAME = "dinesh799";
		String ACCESS_KEY = "34f8da4a-f7ef-446a-98cb-24db6a83a27c";
		String url = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
		 
		RemoteWebDriver driver=new RemoteWebDriver(new URL(url),caps);
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wmt=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		Register reg=PageFactory.initElements(driver, Register.class);
		
		wmt.register();
		reg.registerTest();
		wmt.home();
		wmt.flights();
		System.out.println("TestCase1"+b);
		
		
				
		
	}

}
