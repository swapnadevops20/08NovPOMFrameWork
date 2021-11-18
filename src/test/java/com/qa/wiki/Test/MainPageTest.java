//Entering Selenium Automation
//clicking on search button
//clicking on MainPage link
//clicking on encylopedia
//clicking on Login

package com.qa.wiki.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Page.HomePage;
import com.qa.wiki.Page.MainPage;
import com.qa.wiki.Page.SearchPage;

public class MainPageTest extends Base {
	HomePage hp;
	SearchPage sp;
	MainPage mp;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		initialization();
		hp=new HomePage();
		hp.searchInput("Selenium Automation");
		sp=new SearchPage();
		sp.MainPageLinkClick();
		mp=new MainPage();
		Thread.sleep(3000);
	}
	@Test(priority='1')
	public void enClickText() throws InterruptedException
	{
		mp.encyclopediaClick();
		Thread.sleep(3000);
	}
	
	@Test(priority='2')
	public void loginlinkText()
	{
		mp.loginclick();
	}


}
