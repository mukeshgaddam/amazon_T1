package com.amazon.qa.testCases;

import org.testng.annotations.Test;
import com.amazon.qa.baseClass.BaseClass;
import com.amazon.qa.pages.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.inURL();
		lp.setUserName(userName);
		lp.clickContinue();
		lp.setPassword(password);
		lp.clickSignInbtn();
		
		
	}
}
