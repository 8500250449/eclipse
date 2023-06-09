package marchbatch;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
				WebDriverManager.edgedriver().setup();
			     WebDriver driver=new EdgeDriver();
			    
			     //implicit wait 
			     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			     
			     //explicit wait
			     WebDriverWait wait;
			     
			     wait= new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
			     WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Accounts")));
			     
			     //Fluent Wait
			     
			     Wait fwait=new FluentWait(driver)
			     .withTimeout(java.time.Duration.ofSeconds(30))
			     .ignoring(NoSuchElementException.class)
			     .pollingEvery(java.time.Duration.ofSeconds(5));
			     
			     fwait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Accounts")));
			     
			     //pageload
			     
			     driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(30));
			     
			     
			     
			     
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


