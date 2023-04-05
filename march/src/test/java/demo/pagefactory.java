package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {

		
		WebDriver driver;
		
		//By youraccountlink=By.linkText("your Account")
		@FindBy(linkText="your Account")
		WebElement youraccountlink;

		//By Signin=By.xpath("//*[@id=\"nav-link-accountList\"]");
		@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
		WebElement Signin;
		
		//By Email=By.id("ap_email");
		@FindBy(id="ap_email")
		WebElement Email;
		
		//By Continue=By.id("continue");
		@FindBy(id="continue")
		WebElement Continue;

		//By password=By.id("ap_Password");
		@FindBy(id="ap_Password")
		WebElement Password;
		
		//By SignIn=By.id("signInSubmit");
		
		@FindBy(id="signInSubmit")
		WebElement SignIn;
		
		//By Search=By.id("twotabsearchtextbox");
		@FindBy(id="twotabsearchtextbox")
		WebElement Search;
		
		//By Searchbutton=By.xpath(//*[@id=\"nav-link-accountList\"]");
		@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
		WebElement Searchbutton;
		

		//By iphonemodel=By.linkText("Apple iPhone 13 (128GB) - Midnight");
		@FindBy(linkText="Apple iPhone 13 (128GB) - Midnight")
		WebElement iphonemodel;
		
		//By Add to WishList=By.id("add-to-wishlist-button-submit");
		@FindBy(id="add-to-wishlist-button-submit")
		WebElement AddtoWishList;
		
		//By wishlistclose=By.xpath("//button[@class=\" a-button-close a-declarative\"]");
		@FindBy(xpath="//button[@class=\" a-button-close a-declarative\"]")
		WebElement wishlistclose;
		
		//By Addtocart=By.id("add-to-cart-button");
		@FindBy(id="add-to-cart-button")
		WebElement Addtocart;
		
		//By viewcartbutton=By.id("attach-sidesheet-view-cart-button");
		
		@FindBy(id="attach-sidesheet-view-cart-button")
		WebElement viewcartbutton;
		
		
		
		

		public pagefactory(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}

		public void clickonyouraccountlink()
		{
			(youraccountlink).click();
		}
		
		public void Signin()
		{
			(Signin).click();
		}
		
		public void Email()
		{
			(Email).sendKeys("rockstardivyaakash@gmail.com");
		}
		
		public void Continue()
		{
			(Continue).click();
		}
		
		public void Password()
		{
			(Password).sendKeys("Ammanana@6155");
		}
		
		public void SignIn()
		{
			(SignIn).click();
		}
		
		public void Search()
		{
			(Search).sendKeys("iphone");
		}
		
		public void Searchbutton()
		{
			(Searchbutton).click();
		}
		
		public void iphonemodel()
		{
			(youraccountlink).click();
		}
		
		public void AddtoWishList()
		{
			(AddtoWishList).click();
		}
		
		public void wishlistclose()
		{
			(wishlistclose).click();
		}
		public void Addtocart()
		{
			(Addtocart).click();
		}
		public void viewcartbutton()
		{
			(viewcartbutton).click();
		}
		
		
		
	}
		
	
