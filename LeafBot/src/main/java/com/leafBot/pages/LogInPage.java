package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.selenium.api.design.Browser;
import com.leafBot.selenium.api.design.Element;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

//import base.ProjectSpecificFunctions;

public class LogInPage extends ProjectSpecificMethods implements Browser, Element{
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(className = "decorativeSubmit") WebElement submit;
	public LogInPage enterUserName(String name)
	{
		//driver.findElementById("username").sendKeys(name);
		clearAndType(username, name);
		return this;
	}
	
	public LogInPage enterPassword(String pwd)
	{
		//driver.findElementById("password").sendKeys(password);
		clearAndType(password, pwd);
		return this;
	}
	
	public HomePage clickLogIn()
	{
		//driver.findElementByClassName("decorativeSubmit").click();
		click(submit);
		return new HomePage();
	}

	
}
