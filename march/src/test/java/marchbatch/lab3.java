package marchbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import marchbatch.pageobjects;

public class lab3 {

public static void main(String[] args) {
			// TODO Auto-generated method stub
		
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("https://demo.opencart.com/");
		     
driver.manage().window().maximize();
driver.findElement(By.linkText("Desktops")).click();
driver.findElement(By.linkText("Mac (1)")).click();
Select sortlist1 = new Select(driver.findElement(By.id("input-sort")));
sortlist1.selectByIndex(1);
driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
System.out.println("Item added to cart successfully");
		     
 }
}





