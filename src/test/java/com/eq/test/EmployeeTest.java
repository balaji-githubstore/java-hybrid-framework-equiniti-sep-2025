package com.eq.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.eq.base.AutomationWrapper;
import com.eq.utilities.DataSource;

public class EmployeeTest extends AutomationWrapper {
	
	@Test(dataProvider = "commonDataProvider", dataProviderClass = DataSource.class)
	public void addValidEmployeeTest(String username,String password,String firstname,String middlename,String lastname)
	{
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		//click on add employee
		//enter firstname 
		// middlename
		//lastname
		
//		System.out.println(firstname+" "+lastname);
		//Assert the profile name - firstname lastname
		//assert the textbox of firstname - firstname
	}

}
