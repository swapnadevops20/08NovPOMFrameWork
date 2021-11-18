//TC-1 :Entering the text with "selenium Automation"
//TC-2 :Click on Search Button and going to the next page
//TC-3 :Entering the text "appium" and showing list to select appium
//TC-4 :clicking on the advance search with "documentation"
//Tc-5 : click on the search button
//TC-6 : Clicking on MainPage


package com.qa.wiki.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Page.HomePage;
import com.qa.wiki.Page.SearchPagenew;

public class SearchPagenewTest extends Base {
	
	HomePage hp; 
	 	SearchPagenew sp; 
	 	 
	 	@BeforeClass 
	 	public void setup() throws InterruptedException 
	 	{ 
	 		initialization(); 
	 		hp= new HomePage(); 
	 		hp.searchInput("selenium Automation"); 
	 		sp= new SearchPagenew(); 
	 	} 
	 	 @Test(priority='1') 
		 public void ValidateTitleTest() 
		 { 
		 String title = sp.ValidatePageTitle(); 
		 System.out.println(title); 
		 } 
	 
	 	@Test 
	 	public void searchPageTest() throws InterruptedException 
	 	{ 
	 		sp.SearchResults("appium", "documentation"); 
	 	} 
	 	
	 	 @Test(priority='3') 
		 public void MainPageTest() 
		 { 
		 sp.MainPageClick(); 
		 } 
		 	 
	 	 


}
