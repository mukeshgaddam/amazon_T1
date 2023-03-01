package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver idriver;
	
	public LoginPage(WebDriver rdriver)
	{
		idriver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Hello, sign in')]")
	 WebElement signinurl;
	
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	 WebElement userId ;
	
	@FindBy(xpath="//input[@id='continue']")
	 WebElement Continue;
	
	@FindBy(xpath="//input[@type='password']")
	 WebElement Password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	 WebElement signInButton;
	public void inURL()
	{
		signinurl.click();
	}
	public void setUserName(String name)
	{
		userId.sendKeys(name);
	}
	public void clickContinue() 
	{
		Continue.click();
	}
	public void setPassword(String pas)
	{
		userId.sendKeys(pas);
	}	
	public void clickSignInbtn()
	{
		signInButton.click();
	}
}
