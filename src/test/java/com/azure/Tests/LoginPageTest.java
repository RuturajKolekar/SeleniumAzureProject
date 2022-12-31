package com.azure.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.azure.base.TestBase;
import com.azure.pages.LoginPage;
import com.azure.utils.ExcelUtil;
import com.azure.utils.Utils;


public class LoginPageTest extends TestBase {
	LoginPage lp;
	

	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void preconfig() {
		initialize();
		lp = new LoginPage();
	}
	
	@Test(dataProvider = "getDataFromExcel", dataProviderClass = Utils.class)
	public void LoginTest(String username,String password) {
		lp=new LoginPage();
		lp.login(username,password);
		boolean isLoggedIn=lp.CheckLogin();
		Assert.assertTrue(isLoggedIn);
	}
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
