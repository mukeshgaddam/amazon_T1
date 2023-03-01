package com.amazon.qa.testCases;

import org.testng.annotations.Test;

import com.amazon.qa.baseClass.BaseClass;
import com.amazon.qa.pages.AddAddressPage;

public class TC_AddAddress_001 extends BaseClass
{
	@Test
	public void Addaddress()
	{
		AddAddressPage addpage  = new AddAddressPage(driver);
		addpage.addNewDeliverAddress();
		addpage.addAnAddress();
		addpage.addAddrssBtn();
		addpage.countryOrRegion();
		addpage.fullName();
		addpage.phoneNumber();
		addpage.pinCoard();
		addpage.village();
		addpage.houseNumber();
		addpage.landmark();
		addpage.addThisAddressBtn();
		
	}
}
