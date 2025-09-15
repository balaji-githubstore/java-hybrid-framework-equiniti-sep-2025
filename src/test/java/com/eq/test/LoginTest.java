package com.eq.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		// enter password as admin123
		// click on login

		// Assert the text -- Time at Work
	}

}
