package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;

public class HomePage extends ProjectSpecificMethods{
	
public HomePage(){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="CRM/SFA") WebElement linkText;
	public MyHomePage clickCRMSFA()
	{
		click(linkText);
		return new MyHomePage();
	}
}
