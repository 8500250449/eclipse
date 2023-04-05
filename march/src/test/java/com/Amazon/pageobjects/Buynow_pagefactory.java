package com.Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buynow_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(id="buy-now-button")
	WebElement Buynow;
	
	
	public void clickonBuynow()
	{
		(Buynow).click();
	}
	
}
