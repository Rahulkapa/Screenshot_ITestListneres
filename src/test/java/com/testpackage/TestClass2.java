package com.testpackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;

public class TestClass2 extends BaseClass{
	
	@Test 
	public void Testcase3() {
		setup();
		driver.findElement(By.id("email")).sendKeys("screenshotdemo");
	    Assert.assertTrue(true);
	}
	 
	@Test 
	public void Testcase4() {
		setup();
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
