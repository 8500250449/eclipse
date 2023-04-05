package com.Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class viewcartcount_pagefactory {

	WebDriver driver;
	//By Youraccountlink=By.linkText("Your Account");
	
			@FindBy(linkText="Your Account")
			WebElement youraccountlink;
			
			//By Signinlink=By.linkText("Signin");
			
			@FindBy (xpath="//*[@id=\"nav-link-accountList\"]")
			WebElement Signinlink;
			
			//By Email=By.id("ap_email");
			
			@FindBy(id="ap_email")
			WebElement Email;
			
			//By Continue=By.id("continue");
			
					@FindBy(id="continue")
					WebElement Continue;
			
			
			//By Password=By.id("ap_password");
			@FindBy(id="ap_password")
			WebElement Password;
			
			//By Signinsubmit=By.id("signInSubmit");
			
			@FindBy(id="signInSubmit")
			WebElement Signinsubmit ;
			
			@FindBy(id="nav-cart-count")
			 WebElement Viewcartcount;

			public void clickonyouraccount()
			{
				(youraccountlink).click();
			}
			
			public void clickonsigninlink()
			{
				(Signinlink).click();
			}
			
			public void enteremail(String email1)
			{
				
				(Email).sendKeys(email1);
			}
			
			public void clickoncontinue()
			{
				
				(Continue).click();
			}
			public void enterpassword(String password1)
			{
				(Password).sendKeys(password1);
				
			}
			
			public void clickonsigninsubmit()
			{
				(Signinsubmit).click();
			}
	
 
           public void clickonviewcart()
	      {
		     (Viewcartcount).click();
	       }
 

         }
