package com.Actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class LoginPage {
	
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	//business logic (Non-static method)
	public void login(String username,String password) {
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtn.click();
	}
	
	
}
