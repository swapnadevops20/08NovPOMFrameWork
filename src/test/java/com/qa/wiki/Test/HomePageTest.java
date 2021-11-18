//Validating Title
//CloseBrowser
//searchInputTest is getting failed

package com.qa.wiki.Test; 
 

 import org.testng.Assert; 
 import org.testng.annotations.BeforeClass; 
 import org.testng.annotations.Test; 
 
 
 import com.qa.wiki.Base.Base; 
 import com.qa.wiki.Page.HomePage; 
 
 
 public class HomePageTest extends Base { 
 	 
 	HomePage hp; 
 	 
 	@BeforeClass 
 	public void startbrowser() 
 	{ 
 		initialization(); 
 		hp = new HomePage(); 
 	} 
 	 
 	@Test 
 	public void ValdateTitleTest() 
 	{ 
 		hp.ValidateTitle(); 
 		 
	} 
 	 
 	@Test 
 	public void validateTextTest() 
 	{ 
 		String expText="Read Wikipedia in your language "; 
 		String actualtext = hp.validateText(); 
 		Assert.assertEquals(actualtext, expText,"text do not match"); 
 	} 
 	 
 	@Test 
 	public void searchInputTest() throws InterruptedException   
 	{ 
 		hp.searchInput("SeleniumTesting"); 
 	} 
	 
 	@Test 
 	public void closeBrowser() 
 	{ 
 		driver.close(); 
 	} 
}