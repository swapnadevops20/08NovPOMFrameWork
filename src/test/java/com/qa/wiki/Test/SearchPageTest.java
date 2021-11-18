//There is error in this program so goto SearchPagenewTest,SearchPagenew

package com.qa.wiki.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.wiki.Base.Base;
import com.qa.wiki.Page.HomePage;
import com.qa.wiki.Page.SearchPage;

public class SearchPageTest extends Base {
	// we have to start from the very HomePage 
	//call methods from HomePage class also 
	 	 
	 HomePage hp; 
	 SearchPage sp; 
	 
	 @BeforeClass 
	 public void setup() throws InterruptedException 
	 { 
	 initialization(); 
	 hp= new HomePage(); 
	 hp.searchInput("selenium Automation"); 
	 sp= new SearchPage(); 
	 } 
	 	 
	 @Test(priority='1') 
	 public void ValidateTitleTest() 
	 { 
	 String title = sp.ValidatePageTitle(); 
	 System.out.println(title); 
	 } 
	 	 
	 @Test(priority='2') 
	 public void SearchresultsTest() throws InterruptedException 
	 { 
	 sp.searchResults("Appium", "Documentation"); 
	 } 
	 	 
	 @Test(priority='3') 
	 public void MainPageTest() 
	 { 
	 sp.MainPageLinkClick(); 
	 } 
	 	 
}
