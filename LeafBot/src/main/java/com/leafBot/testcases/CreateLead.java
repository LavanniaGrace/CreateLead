package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.pages.LogInPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;
//import createLead.LogInPage;

public class CreateLead extends ProjectSpecificMethods{

	@Test(dataProvider ="fetchData")
	public void createLead(String userName, String password, String companyName,
			String firstName, String lastName)
	{
		new LogInPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)		
		.clickCreateLead();
		
	}

}
