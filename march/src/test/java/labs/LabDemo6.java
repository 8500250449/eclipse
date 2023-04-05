package labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     driver.get("https://demo.opencart.com/");
	     driver.findElement(By.linkText("My Account")).click();
	     driver.findElement(By.linkText("Login")).click();
	     driver.findElement(By.id("input-email")).sendKeys("march@gmail.com");
	     driver.findElement(By.id("input-password")).sendKeys("welcome");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
	     
	     driver.findElement(By.linkText("Components")).click();
	     Select sortlist=new Select(driver.findElement(By.id("input-sort")));
	     
	     
	     
	     driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25_28");
	     
	  
	}

}
