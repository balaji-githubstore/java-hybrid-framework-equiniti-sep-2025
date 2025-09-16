package com.eq.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login') or contains(normalize-space(),'登录')]")).click();

		String actualText=driver.findElement(By.xpath("//p[contains(normalize-space(),'Time at')]")).getText();
		Assert.assertEquals(actualText, "Time at Work");
	}

	@Test
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login') or contains(normalize-space(),'登录')]")).click();

		//Assert the Invalid credentials
		String actualError=driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertEquals(actualError, "Invalid credentials");
	}
}
