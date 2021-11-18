//There is error in this program so goto SearchPagenewTest,SearchPagenew

package com.qa.wiki.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.wiki.Base.Base;

public class SearchPage extends Base{

	@FindBy(xpath="//*[@id='ooui-php-1']") 
	 	WebElement inputbox; 
	 	@FindBy(xpath="//*[@id='powersearch']/descendant::button[1]") 
	 	WebElement searchBtn; 
	 	@FindBy(xpath="//*[@class='oo-ui-indicatorElement-indicator oo-ui-indicator-down'])[1]") 
	 	WebElement dd; 
	 	@FindBy(xpath="//*[@id='powersearch']/descendant::input[5]") 
	 	WebElement advanceInput; 
	 	@FindBy(linkText="Main page") 
	 	WebElement mainPage; 
	 	 
	 	public SearchPage() 
	 	{ 
	 		PageFactory.initElements(driver, this); 
	 	} 
	 	 
	 	 
	 	public String ValidatePageTitle() 
	 	{ 
	 		return driver.getTitle(); 
	 	} 
	 	 
	 	public void searchResults(String input1,String input2) throws InterruptedException 
	 	{ 
	 		Thread.sleep(3000); 
	 		inputbox.clear(); 
	 		 
	 		inputbox.sendKeys(input1); 
	 		//dd.click(); 
	 		Thread.sleep(2000); 
	 		//advanceInput.clear(); 
	 		//advanceInput.sendKeys(input2); 
	 		//Thread.sleep(1000); 
	 		searchBtn.click(); 
	 		Thread.sleep(2000); 
	 		 
	 	} 
	 	 
	 	public MainPage MainPageLinkClick() 
	 	{ 
	 		String text= mainPage.getText(); 
	 		System.out.println("the text of the link is: "+ text); 
	 		mainPage.click(); 
 		return new MainPage(); 
	 	} 

}
