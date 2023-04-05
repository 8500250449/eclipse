package com.Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class language_pagefactory {

	WebDriver driver;
	
	
	
	@FindBy (xpath="//*[@class=\"icp-nav-link-inner\"]")
	WebElement Languages ;
	

	@FindBy(xpath="//*[@class=\"a-button-input\"]")
	WebElement Savechanges;

	public void clickonlanguages()
	{
		(Languages).click();
	}
	
	public void clickonsavechanges()
	{
		(Savechanges).click();
	}
	
	

}
