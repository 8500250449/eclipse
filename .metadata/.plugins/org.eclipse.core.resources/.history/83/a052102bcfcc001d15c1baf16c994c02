package labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactoryR {

	WebDriver driver;
	
	//By myaccountlink=By.linkText("My Account");
	@FindBy(linkText="My Account")
	WebElement myaccountlink;
	
	//By registerlink=By.linkText("Register");
	@FindBy(linkText="Register")
	WebElement registerlink;
	
	//By firstname=By.id("input-firstname");
	@FindBy(id="input-firstname")
	WebElement firstname;

	
	//By lastname=By.id("input-lastname");
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	//By email=By.id("input-email");
	@FindBy(id="input-email")
	WebElement email;
	
	//By password=By.id("input-password");
	@FindBy(id="input-password")
	WebElement password;
	
	//By newsletter=By.id("input-newsletter-yes");
	@FindBy(id="input-newsletter-yes")
	WebElement newsletter;
	
	//By checkbox=By.xpath("//input[@type='checkbox']");
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	//By continuebutton=By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement continuebutton;
	
	

	public void clickonmyaccount()
	{
		(myaccountlink).click();
	}
	
	public void clickonregisterlink()
	{
		(registerlink).click();
	}
	public void enterfirstname()
	{
		(firstname).sendKeys("Divya");
	}
	
	public void enterlastname()
	{
	     lastname.sendKeys("Patchipulusu");
	}
	
	public void enteremail()
	{
		
		(email).sendKeys("march@gmail.com");
	}
	
	public void enterpassword()
	{
		(password).sendKeys("welcome");
		
	}
	
	public void clickonnewsletter()
	{
	newsletter.click();
	}
	
	public void clickoncheckbox()
	{
		 checkbox.click();
	}
	
	public void clickonsubmit()
	{
	continuebutton.click();
	}
}


