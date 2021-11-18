//Entering Text "Selenium Testing"
//Click on search button
//click on MainPage link
//click on loginPage
//Enter credentials and click to login
//click  on help link


package com.qa.wiki.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.Base.Base;

public class LoginPage extends Base {

	@FindBy(id="wpName1")
	WebElement username;
	@FindBy(id="wpPassword1")
	WebElement password;
	@FindBy(id="wpRemember")
	WebElement checkbox;
	@FindBy(linkText="Help with logging in")
	WebElement help;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

public void login(String uname,String pwd)
{
	username.clear();
	username.sendKeys(uname);
	password.clear();
	password.sendKeys(pwd);
	checkbox.click();
}

public void helpLinkClick()
{
	help.click();
}


	
}
