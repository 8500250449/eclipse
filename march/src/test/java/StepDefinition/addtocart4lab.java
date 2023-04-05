package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocart4lab{
WebDriver driver;

@Given("launch the URL")
public void launch_the_url() {
   
	WebDriverManager.edgedriver().setup();
     driver=new EdgeDriver();
     driver.get("https://demo.opencart.com/");
}

@And("Navigate the URL")
public void navigate_the_url() {
	driver.findElement(By.linkText("Desktops")).click();
}


@And("click on the mac")
public void click_on_the_mac() {
	driver.findElement(By.linkText("Mac (1)")).click();
	WebElement heading=driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
    
}

@And("click on the sortlist1")
public void click_on_the_sortlist1() {
	Select sortlist1 = new Select(driver.findElement(By.id("input-sort")));
	sortlist1.selectByIndex(1);
   
}

@When("click on add to cart button")
public void click_on_add_to_cart_button() {
	driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
}

@Then("product should be add to cart successfully")
public void product_should_be_add_to_cart_successfully() {
	System.out.println("Item not added to cart successfully");
}	
}


