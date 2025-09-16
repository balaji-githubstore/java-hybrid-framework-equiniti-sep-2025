package com.eq.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * Will be deleted
 */
public class ZDemo1Test {
	
	@DataProvider
	public Object[][] demoLoginData()
	{
		Object[][] data=new Object[3][2]; 
		//i --> number of testcase
		//j--> number of parameter
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="peter";
		data[2][1]="peter123";
		
		return data;
	}
	
	@Test(dataProvider = "demoLoginData")
	public void demoLoginTest(String username,String password)
	{
		System.out.println("test"+username+password);
	}

}
