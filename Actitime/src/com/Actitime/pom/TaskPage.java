package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class TaskPage {
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement add;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newcustname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdsp;
	
	@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement dropdownbtn;
	
	@FindBy(xpath = "(//div[.='Our company'])[2]")
	private WebElement ourcmp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement crtbtn;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	//bussiness Logic 
	
	
}
