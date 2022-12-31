package com.azure.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.azure.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
	WebElement username;

	@FindBy(id = "userPassword")
	WebElement password;

	@FindBy(id = "login")
	WebElement login;
	
	@FindBy(xpath = "//h4[text()='Filters']")
	WebElement HomeLogo;

	public HomePage login(String username1 , String password1) {
		username.sendKeys(username1);
		password.sendKeys(password1);
		login.click();
		return new HomePage();
	}
	
	public boolean CheckLogin() {
		return HomeLogo.isDisplayed();
	}
	

}
