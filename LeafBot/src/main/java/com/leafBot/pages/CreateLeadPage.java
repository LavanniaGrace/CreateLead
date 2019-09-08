package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.selenium.api.design.Browser;
import com.leafBot.selenium.api.design.Element;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods implements Browser,Element{
	public CreateLeadPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement c_Name;
	@FindBy(id="createLeadForm_firstName") WebElement f_Name;
	@FindBy(id = "createLeadForm_lastName") WebElement l_Name;
	@FindBy(className = "smallSubmit") WebElement submit;
	public CreateLeadPage enterCompanyName(String companyName)
	{
		//driver.findElementById(cName).sendKeys(companyName);
		clearAndType(c_Name,companyName );
		return this;  
	}
	
	public CreateLeadPage enterFirstName(String firstName)
	{
		//driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		clearAndType(f_Name,firstName );
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName)
	{
		//driver.findElementById(lastName).sendKeys(lastName);
		clearAndType(l_Name,lastName );
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		//driver.findElementByClassName("smallSubmit").click();
		click(submit);
		return new ViewLeadPage();
	}
 

}
