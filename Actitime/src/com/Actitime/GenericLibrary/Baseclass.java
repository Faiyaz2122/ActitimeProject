//DATE :- 17-02-2023.

package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class Baseclass {
	
	

	private static final String Psw = null;

	FileLibrary f = new FileLibrary();
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection(){
		Reporter.log("database Connected Successfully",true);
	}
	
	@AfterSuite
	public void databasedisconnection(){
		Reporter.log("database disconnected Successfully",true);
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Url = f.readDataFromPropertyFile("url");
		driver.get(Url);
		Reporter.log("Browser Launched Successfully",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("Browser Closed Successfully");
	}
	
	@BeforeMethod
	public void loginToActitime() throws InterruptedException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String UN = f.readDataFromPropertyFile("username");
		String PW = f.readDataFromPropertyFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(UN, PW);
		
		//driver.findElement(By.id("username")).sendKeys(UN);
		//driver.findElement(By.name("pwd")).sendKeys(PW);
	
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Reporter.log("Logged in successfully",true);
	}
	
	@AfterMethod
	public void logoutFromActitime() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out successfully",true);
	}
	
	
	
	
	
}
