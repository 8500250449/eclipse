package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginopencart {
WebDriver driver;
	
	@Given("launch the URL")
	public void launch_the_url() {
	   
		WebDriverManager.edgedriver().setup();
	     driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/");
	}

	@And("Navigate the URL")
	public void navigate_the_url() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	   }

	@And("enter the username and password")
	public void enter_the_username_and_password() {
	    driver.findElement(By.id("input-email")).sendKeys("Divya@gmail.com");
	    driver.findElement(By.id("input-password")).sendKeys("welcome");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    	}

	@Then("login should be successful")
	public void login_should_be_successful() {
		
		System.out.println("login is not successful");
	    
	}
}
