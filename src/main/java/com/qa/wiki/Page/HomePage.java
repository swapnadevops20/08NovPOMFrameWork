//Validating Title
//CloseBrowser
//searchInputTest is getting failed


package com.qa.wiki.Page; 
 
 
 import org.openqa.selenium.WebElement; 
 import org.openqa.selenium.support.FindBy; 
 import org.openqa.selenium.support.PageFactory; 
 

 import com.qa.wiki.Base.Base; 
 

 public class HomePage extends Base { 
 	 
 	// Locate elements 
 	  
 	// WebElement e =driver.findelement(By.locatorname("value") 
 	 
 	// Creating a Object repository 
 	 
 	@FindBy(xpath="//*[@id='search-form']/descendant::input[3]") 
 	WebElement input; 
 	 
 	@FindBy(xpath="//*[@id='search-form']/descendant::button[1]") 
 	WebElement srchbtn; 
 	 
 	@FindBy(xpath="//*[@class='lang-list-button-wrapper']/descendant::span[1]") 
 	WebElement ReadText; 
 	 
 	// initialize the elements that are located 
 	// use class PageFactory and method initElements, driver object 
 	 
 	public HomePage() 
 	{ 
 	 
 		PageFactory.initElements(driver, this); 
 	 
 	} 
 

 	// Action Methods for every element 
 	 
 	public void ValidateTitle() 
 	{ 
 		String title= driver.getTitle(); 
 		System.out.println(title); 
 	} 
 	 
 	public String validateText() 
 	{ 
 		String text= ReadText.getText(); 
 		System.out.println(text); 
		return text; 
 	} 
 	 
	public SearchPage searchInput(String input1) throws InterruptedException 
 	{ 
 		input.clear(); 
 		input.sendKeys(input1); 
 		Thread.sleep(2000); 
 		srchbtn.click(); 
 		return new SearchPage(); 
 	} 
 	 
}