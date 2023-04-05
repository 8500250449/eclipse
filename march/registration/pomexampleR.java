package labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import marchbatch.pageobjects;

public class pomexampleR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/");
	     
	     pageobjectsR obj=new pageobjectsR(driver);
	     
	     obj.clickonmyaccount();
	     obj.clickonregisterlink();
	     obj.enterfirstname();
	     obj.enterlastname();
	     obj.enteremail();
	     obj.enterpassword();
	     obj.clickonnewsletter();
	     obj.clickoncheckbox();
	     obj.clickoncontinue();
	       
	}

}
