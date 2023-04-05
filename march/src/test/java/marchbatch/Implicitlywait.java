package marchbatch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitlywait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
	     WebDriver driver=new EdgeDriver();
	     	     
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    driver.get("https://demo.opencart.com/");
      Thread.sleep(20);
	    
	    driver.findElement(By.linkText("My Accounts")).click();
	    driver.findElement(By.linkText("Login")).click();
	    
	    Thread.sleep(20);
	    List <WebElement>l1=(List) driver.findElement(By.xpath("//a[@class='list-group-item']"));
	    
	    System.out.println("list count is :"+l1.size());
	    
	    for(WebElement i:l1)
	    {
	    	System.out.println("list is:"+i.getText());
	    	System.out.println ("Attribute is"+i.getAttribute("class"));
	    	System.out.println ("Attribute is"+i.getAttribute("href"));
	    	
	    }
	    
	    	
	   }
	
	}