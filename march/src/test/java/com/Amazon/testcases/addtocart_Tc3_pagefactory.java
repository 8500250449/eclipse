package com.Amazon.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Amazon.pageobjects.Addtocart_pagefactory;
import com.Amazon.pageobjects.search_pagefactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocart_Tc3_pagefactory {

	
		@Test
			public void Tc3_pagefactory() throws IOException, InterruptedException {
				// TODO Auto-generated method stub
			String projectpath=System.getProperty("user.dir");
			ExtentReports extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\Reports\\TC4.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Adding the product to the cart in Amazon");
			
			String propertypath="C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\input.properties2";
			propertypath=propertypath.trim();
			InputStream input=new FileInputStream(propertypath);
			Properties prob=new Properties();
			prob.load(input);
			String url=prob.getProperty("url");
			
			/*File f1=new File("C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\amazon.xlsx");
			FileInputStream fis=new FileInputStream(f1);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheetAt(0);
			int rowcount=sheet.getPhysicalNumberOfRows();
			for(int i=0;i<rowcount;i++)
			{
				  
				
		//String email=sheet.getRow(i).getCell(0).getStringCellValue();
		//String password=sheet.getRow(i).getCell(1).getStringCellValue();*/

				 WebDriverManager.edgedriver().setup();
				 
			     WebDriver driver=new EdgeDriver();
			    
			     Addtocart_pagefactory obj=PageFactory.initElements(driver,Addtocart_pagefactory.class);
			     
			     driver.get(url);
			     
			    obj.clickonaddtocart();
			  test.pass("Item is add to the cart successfully");
			   
			         extent.flush();
		 }
		}


