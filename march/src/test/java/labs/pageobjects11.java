package labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjects11{

WebDriver driver;

By Desktops=By.linkText("Desktops");
By Mac=By.linkText("Mac (1)");
By Heading=By.xpath("//*[@id=\"content\"]/h2");
By sortlist=By.id("input-sort");
By Addtocartbutton=By.xpath("//button[@aria-label='Add to Cart']");

public pageobjects11(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}



public void  ClickonDesktops()
{
	driver.findElement(Desktops).click();
}
}
