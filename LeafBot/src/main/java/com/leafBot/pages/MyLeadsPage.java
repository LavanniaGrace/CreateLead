package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;

public class MyLeadsPage extends ProjectSpecificMethods {
	public static String id;
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead") WebElement createLead;
	@FindBy(linkText="Find Leads") WebElement findLead;
	@FindBy(xpath = "//span[text() = 'Email']") WebElement email;
	@FindBy(name = "emailAddress") WebElement emailAddress;
	@FindBy(xpath = "//button[text() = 'Find Leads']") WebElement lead;
	@FindBy(xpath = "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a") WebElement firstLead;
public CreateLeadPage clickCreateLead()
{
	click(createLead);
	return new CreateLeadPage();  
}

public MyLeadsPage clickFindLeads() throws InterruptedException
{
	Thread.sleep(3000);
	click(findLead);
	return this;
}


public MyLeadsPage clickEMail()
{
	click(email);
	return this;
}

public MyLeadsPage enterEMail(String eMail)
{
	clearAndType(emailAddress,eMail);
	return this;
}

public MyLeadsPage clickFindLeadsButton() throws InterruptedException
{
	click(lead);
	Thread.sleep(5000);
	return this; 
}

public ViewLeadPage clickFirstLead()
{
	click(firstLead);	   	  
	 return new ViewLeadPage();
}

public MyLeadsPage verifyLeadId()
{
	System.out.println("Lead not found");
	return this;
}
}
