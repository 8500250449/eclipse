package labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectsR {

	WebDriver driver;
	By myaccountlink=By.linkText("My Account");
	By registerlink=By.linkText("Register");
	By firstname=By.id("input-firstname");
	By lastname=By.id("input-lastname");
	By email=By.id("input-email");
	By password=By.id("input-password");
	By newsletter=By.id("input-newsletter-yes");
	By checkbox=By.xpath("//input[@type='checkbox']");
	By continuebutton=By.xpath("//button[@type='submit']");
	
	public pageobjectsR(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public void clickonmyaccount()
	{
		driver.findElement(myaccountlink).click();
	}
	
	public void clickonregisterlink()
	{
		driver.findElement(registerlink).click();
	}
	public void enterfirstname()
	{
		driver.findElement(By.id("input-firstname")).sendKeys("Divya");
	}
	
	public void enterlastname()
	{
	     driver.findElement(By.id("input-lastname")).sendKeys("Patchipulusu");
	}
	
	public void enteremail()
	{
		
		driver.findElement(email).sendKeys("march@gmail.com");
	}
	
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("welcome");
		
	}
	
	public void clickonnewsletter()
	{
		driver.findElement(By.id("input-newsletter-yes")).click();
	}
	
	public void clickoncheckbox()
	{
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
	
	public void clickoncontinue()
	{
		driver.findElement(continuebutton).click();
	}
}


