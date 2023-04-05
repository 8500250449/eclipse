package com.Amazon.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     
         driver.findElement(By.linkText("Your Account")).click();
	     
	     driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	    
	     driver.findElement(By.id("ap_email")).sendKeys("rockstardivyaakash@gmail.com");
	     driver.findElement(By.id("continue")).click();
	     driver.findElement(By.id("ap_password")).sendKeys("Ammanana@6155");
	     driver.findElement(By.id("signInSubmit")).click();
	    
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	     driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click(); 
	     
	     driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();
	    
	     List<String> l1=new ArrayList<String>(driver.getWindowHandles());
	     System.out.println(l1.size());
	     Thread.sleep(38);
	     driver.switchTo().window(l1.get(1));
	     JavascriptExecutor js=(JavascriptExecutor)driver;
		  //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  js.executeScript("window.scrollBy(0,730)");
		
	     
	    driver.findElement(By.id("add-to-wishlist-button-submit")).click();
	    
	    driver.findElement(By.xpath("//button[@class=\" a-button-close a-declarative\"]")).click();
	    driver.findElement(By.id("add-to-cart-button")).click();
	    driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
	    Select quantity = new Select(driver.findElement(By.id("quantity")));
	    quantity.selectByIndex(1);
	    driver.quit();
	}
}
	   
