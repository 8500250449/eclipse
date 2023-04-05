package demo;


	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import marchbatch.pagefactory2;
import marchbatch.pageobjects;
	public class example {

		@Test
		public  void Testcase3() throws IOException {
			// TODO Auto-generated method stub
			
			String projectpath=System.getProperty("user.dir");
			ExtentReports extent=new ExtentReports();
			ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\Reports\\TC2.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Sign in Amazon");
			
			String propertypath="C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\inputproperties2";
			propertypath=propertypath.trim();
			InputStream input=new FileInputStream(propertypath);
			Properties prob=new Properties();
			prob.load(input);
			
			String url=prob.getProperty("url");
			
			File f1=new File("C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\Amazon\\testdata\\amazon.xlsx");
			FileInputStream fis=new FileInputStream(f1);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheetAt(0);
			int rowcount=sheet.getPhysicalNumberOfRows();
			for(int i=0;i<rowcount;i++)
			{
				  
				
		String email=sheet.getRow(i).getCell(0).getStringCellValue();
		String password=sheet.getRow(i).getCell(1).getStringCellValue();
		

				 
			WebDriverManager.edgedriver().setup();
		     WebDriver driver=new EdgeDriver();
		     driver.get("https://www.amazon.in/");
		     
		     pagefactory obj=PageFactory.initElements(driver,pagefactory.class);
		     
		    
		     
              driver.get(url);
		     
		     if(driver.findElement(By.linkText("clickonyouraccountlink")).isDisplayed())
		     {
		    	 test.pass("My Account is clicked");
		     }
		     else 
		     {
		    	 test.fail("My Account is not clicked"); 
		     }
		     obj.Signin();
		     obj.Email();
		     obj.Continue();
		     obj.Password();
		     obj.SignIn();
		     obj.Search();
		     obj.Searchbutton();
		     obj.iphonemodel();
		     obj.AddtoWishList();
		     obj.wishlistclose();
		     obj.Addtocart();
		     obj.viewcartbutton();
		     driver.quit();
		     extent.flush();
		     
		    
		}

	 }
	}
