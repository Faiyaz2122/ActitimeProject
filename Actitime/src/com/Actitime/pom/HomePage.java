//Date:- 18-02-2023

package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(id = "logoutLink")
	private WebElement lgoutlink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getLgoutlink() {
		return lgoutlink;
	}
	
}
