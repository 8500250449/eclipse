package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pomexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/");
	     
	     pageobjects obj=new pageobjects(driver);
	     
	     obj.clickonmyaccount();
	     obj.clickonloginlink();
	     obj.enteremail();
	     obj.enterpassword();
	     obj.clickonsubmit();
	     
	     /*driver.findElement(By.linkText("My Account")).click();
	     driver.findElement(By.linkText("Login")).click();
	     driver.findElement(By.id("input-email")).sendKeys("march@gmail.com");
	     driver.findElement(By.id("input-password")).sendKeys("welcome");
	     driver.findElement(By.xpath("//button[@type='submit']")).click(); */
	}

}
