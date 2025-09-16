package com.eq.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;
import com.eq.pages.DashboardPage;
import com.eq.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {

		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		String actualText = dashboard.getTimeAtWorkText();
		Assert.assertEquals(actualText, "Time at Work");
	}

	@Test
	public void invalidLoginTest() {

		LoginPage login = new LoginPage(driver);
		login.enterUsername("peter");
		login.enterPassword("admin123");
		login.clickOnLogin();

		// Assert the Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
}
