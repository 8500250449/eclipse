package com.Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart_pagefactory {
	
	WebDriver driver;
	
	
	@FindBy(id="add-to-cart-button")
	WebElement Addtocart;
	
	
	public void clickonaddtocart()
	{
		(Addtocart).click();
	}
	
}
