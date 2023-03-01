package com.amazon.qa.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public String baseURL = "https://www.amazon.com/";
	public String userName = "8297487606";
	public String password = "Chsumuma@1";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
	  
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
