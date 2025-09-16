package com.eq.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;
import com.eq.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {

		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		String actualText = driver.findElement(By.xpath("//p[contains(normalize-space(),'Time at')]")).getText();
		Assert.assertEquals(actualText, "Time at Work");
	}

	@Test
	public void invalidLoginTest() {

		LoginPage login = new LoginPage(driver);
		login.enterUsername("john");
		login.enterPassword("admin123");
		login.clickOnLogin();

		// Assert the Invalid credentials
		String actualError = login.getInvalidErrorMessage();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
}
