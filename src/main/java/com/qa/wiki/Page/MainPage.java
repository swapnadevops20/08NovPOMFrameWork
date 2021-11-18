//Entering Selenium Automation
//clicking on search button
//clicking on MainPage link
//clicking on encylopedia
//clicking on Login


package com.qa.wiki.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.Base.Base;

public class MainPage extends Base {
	
	@FindBy(linkText="encyclopedia")
	WebElement en;
	@FindBy(linkText="Log in")
	WebElement login;
	
	public MainPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void encyclopediaClick()
	{
		en.click();
	}
public LoginPage loginclick()
{
	login.click();
	return new LoginPage();
}
}
