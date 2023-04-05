package com.Amazon.pageobjects;

	import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class search_pagefactory {

		WebDriver driver;
		
			
		@FindBy(id="twotabsearchtextbox")
		WebElement Searchbox;
		
		
		
		@FindBy (xpath="//*[@id=\"nav-search-submit-button\"]")
		WebElement Searchbutton ;
		


		public void clickonsearchbox()
		{
			(Searchbox).sendKeys("watch");
		}
		
		public void clickonsearchbutton()
		{
			(Searchbutton).click();
		}
		
	}




