package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads") WebElement linkText;
	public MyLeadsPage clickLead()
	{
		click(linkText);
		return new MyLeadsPage();  
	}

}
