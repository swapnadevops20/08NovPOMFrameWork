//TC-1 :Entering the text with "selenium Automation"
//TC-2 :Click on Search Button and going to the next page
//TC-3 :Entering the text "appium" and showing list to select appium
//TC-4 :clicking on the advance search with "documentation"
//Tc-5 : click on the search button
//TC-6 : Clicking on MainPage

//This test will be execute in SearchPagenewTest


package com.qa.wiki.Page;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 

import com.qa.wiki.Base.Base; 

public class SearchPagenew extends Base{ 
	 	@FindBy(xpath="//*[@id='ooui-php-1']") 
	 	WebElement Searchinput; 
	 	@FindBy(xpath="//*[@class='oo-ui-inputWidget-input oo-ui-buttonElement-button']") 
	 	WebElement Searchbutton; 
	 	@FindBy(linkText="Main page") 
	 	WebElement mainpage; 
	 	@FindBy(xpath="(//*[@class='oo-ui-indicatorElement-indicator oo-ui-indicator-down'])[1]") 
	 	WebElement AdvSrch; 
	 	@FindBy(xpath="(//*[@id='ooui-31'])") 
	 	WebElement AdvSrchInput; 
	 	@FindBy(xpath="(//*[@class='oo-ui-labelElement-label'])[2]") 
	 	WebElement AdvSearchBtn; 
	 	 
	 	public  SearchPagenew() 
	 	{ 
	 		PageFactory.initElements(driver, this); 
	 		 
	 	} 
	 	 
	 	public String ValidatePageTitle() 
	 	{ 
	 		return driver.getTitle(); 
	 	} 
	 	 
	 	 
	 	public void SearchResults(String input1, String input2) throws InterruptedException 
	 	{ 
	 		Searchinput.clear(); 
	 		Thread.sleep(1500); 
	 		Searchinput.sendKeys(input1); 
	 		Thread.sleep(1500); 
	 		AdvSrch.click(); 
	 		Thread.sleep(1500); 
	 		AdvSrchInput.clear(); 
	 		AdvSrchInput.sendKeys(input2); 
			Thread.sleep(1500); 
	 		AdvSearchBtn.click(); 
	 				 
	 	} 
	 
	 	
	 
	 	public MainPage MainPageClick() 
	 	{ 
	 		String text= mainpage.getText(); 
	 		System.out.println("the text of the link is: "+ text); 
	 		
	 		mainpage.click(); 
	 		return new MainPage(); 
	 	} 
	 } 



