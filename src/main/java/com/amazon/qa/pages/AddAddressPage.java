package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage 
{
	WebDriver driver;
WebDriver idriver;
	
	public AddAddressPage(WebDriver rdriver)
	{
		idriver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@id='nav-packard-glow-loc-icon']")
	WebElement AddNewDeliveryAddress;
	
	@FindBy(xpath="//a[contains(text(),'Add an address or pick-up point ')]")
	WebElement AddAnAddress;
	
	@FindBy(xpath="//h2")
	WebElement AddAddressBtn;
	
	@FindBy(xpath="//option[text()='India']")
	WebElement CountryRegion;
	
	@FindBy(xpath="//input[@Id='address-ui-widgets-enterAddressFullName']")
	WebElement FullName;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressLine2']")
	WebElement  Village;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressLine1']")
	WebElement HouseNumber;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-landmark']")
	WebElement Landmark;
	
	@FindBy(xpath="//input[@aria-label='Town/City']")
	WebElement City;
	
	@FindBy(xpath="//span[text()='Choose a state']")
	WebElement State;
	
	@FindBy(xpath="//a[text()='ANDHRA PRADESH']")
	WebElement StateName;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressPostalCode']")
	WebElement PostalCode;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//span[text()='Add address']")
	WebElement AddThisAddressBtn;
	
	@FindBy(xpath="//a[text()=' Select an Address Type ']")
	WebElement AddressType;
	
	@FindBy(xpath="//a[contains(text(),' Home (7 am – 9 pm delivery) ')]")
	WebElement HomeType;
	
	public void addNewDeliverAddress()
	{
		AddNewDeliveryAddress.click();
	}
	public void addAnAddress()
	{
		AddAnAddress.click();
	}
	public void addAddrssBtn()
	{
		AddAddressBtn.click();
	}
	public void countryOrRegion()
	{
		CountryRegion.click();
	}
	public void fullName()
	{
		FullName.sendKeys("Mukesh Gaddam");
	}
	public void village()
	{
		Village.sendKeys("A G Gari Palli");
	}
	public void houseNumber()
	{
		HouseNumber.sendKeys("1-56/A");
	}
	public void pinCoard()
	{
		PostalCode.sendKeys("517102");
	}
	public void landmark()
	{
		Landmark.sendKeys("Lard krishna Timple");
	}
	public void addThisAddressBtn()
	{
		AddThisAddressBtn.click();
	}
	public void phoneNumber()
	{
		PhoneNumber.sendKeys("8886445771");
	}
		
	}
