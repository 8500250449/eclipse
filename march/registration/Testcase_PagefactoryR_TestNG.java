package labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import marchbatch.pagefactory1;
import marchbatch.pageobjects;

public class Testcase_PagefactoryR_TestNG {

	

		@Test
		public void testcase1() {

		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/");
	     
	     pagefactoryR obj=PageFactory.initElements(driver,pagefactoryR.class);
	     
	     obj.clickonmyaccount();
	     obj.clickonregisterlink();
	     obj.enterfirstname();
	     obj.enterlastname();
	     obj.enteremail();
	     obj.enterpassword();
	     obj.clickonnewsletter();
	     obj.clickoncheckbox();
	     obj.clickonsubmit();
	       
	}

}
