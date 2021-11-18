//Entering Text "Selenium Testing"
//Click on search button
//click on MainPage link
//click on loginPage
//Enter credentials and click to login
//click  on help link

package com.qa.wiki.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Page.HomePage;
import com.qa.wiki.Page.LoginPage;
import com.qa.wiki.Page.MainPage;
import com.qa.wiki.Page.SearchPage;

public class LoginPageTest extends Base {
	
	HomePage hp;
	SearchPage sp;
	MainPage mp;
	LoginPage lp;

	@BeforeClass
	public void Setup() throws InterruptedException
	{
		initialization();
		hp=new HomePage();
		hp.searchInput("Selenium Testing");
		sp=new SearchPage();
		Thread.sleep(3000);
		sp.MainPageLinkClick();
		mp=new MainPage();
		Thread.sleep(3000);
		mp.loginclick();
		lp=new LoginPage();
		Thread.sleep(3000);
	}
	
	@Test(priority='1')
	public void enteruserDetailsTest() throws InterruptedException
	{
		lp.login("swapna123","abc@123");
		Thread.sleep(3000);

	}
	
	@Test(priority='2')
	public void helpLinkTest() throws InterruptedException
	{
		lp.helpLinkClick();
		Thread.sleep(3000);

	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	}
