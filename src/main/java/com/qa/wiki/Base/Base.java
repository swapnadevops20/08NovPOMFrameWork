//This is Parent / Base class
//Opening browser
//Opening URL

package com.qa.wiki.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.get("https://www.wikipedia.org/");
		
	}

}
