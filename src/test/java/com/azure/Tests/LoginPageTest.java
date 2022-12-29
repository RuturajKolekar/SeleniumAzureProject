package com.azure.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azure.base.TestBase;
import com.azure.pages.LoginPage;

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
	
	@Test
	public void Login() {
		lp=new LoginPage();
		lp.login();
	}
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
