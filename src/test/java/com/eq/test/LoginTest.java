package com.eq.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;
import com.eq.pages.DashboardPage;
import com.eq.pages.LoginPage;
import com.eq.utilities.DataSource;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataSource.class,groups = {"smoke"})
	public void validLoginTest(String username,String password,String expectedValue) {

		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		String actualText = dashboard.getTimeAtWorkText();
		Assert.assertEquals(actualText, expectedValue);
	}

	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataSource.class)
	public void invalidLoginTest(String username, String password, String expectedError) {

		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		// Assert the Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
