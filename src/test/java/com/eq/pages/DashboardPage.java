package com.eq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private By timeAtWorkLocator = By.xpath("//p[contains(normalize-space(),'Time at')]");

	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTimeAtWorkText() {
		return driver.findElement(timeAtWorkLocator).getText();
	}
}
