package com.Actitime.Testscipts;

import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.pom.HomePage;

public class CreateCustomer extends Baseclass {
	
	@Test
	public void createCustomer() throws InterruptedException {
		
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(4000);
		hp.getTasklnk();
	}

}
