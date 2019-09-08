package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="subMenuButtonDangerous") WebElement delete;
	
	public ViewLeadPage verifyFirstName()
	{
		System.out.println("Successful");
		return this;
	}
	
	public MyLeadsPage clickDelete()
	{
		click(delete);
		return new MyLeadsPage();
	}

}
