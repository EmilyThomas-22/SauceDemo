package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucepage {
	WebDriver driver;
	
	By loginBtn=By.name("login-button");
	By username=By.id("user-name");
	By psswd=By.id("password");
//	By product1=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
//	By product2=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
//	By product3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
//	By product4=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
//	By product5=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
//	By product6=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By checkout=By.xpath("//*[@id=\"checkout\"]");
	By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By firstname=By.xpath("//*[@id=\"first-name\"]");
	By lastname=By.xpath("//*[@id=\"last-name\"]");
	By zip=By.xpath("//*[@id=\"postal-code\"]");
	By cont=By.xpath("//*[@id=\"continue\"]");
	By harmburg=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	
	
//	@FindBy(id="email")
//	WebElement fbmail;
//	@FindBy(id="pass")
//	WebElement fbpassword;
//	@FindBy(name="login")
//	WebElement login;
	
	
	public saucepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void setvalues(String Username,String Password)
	{
		driver.findElement(username).sendKeys(Username);
		driver.findElement(psswd).sendKeys(Password);
		
	}
	public void login()
	{
		driver.findElement(loginBtn).click();
		
	}
	By product1=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By product2=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By product3=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By product4=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
	By product5=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By product6=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	public void Products() 
	{


		driver.findElement(product1).click();
		driver.findElement(product2).click();
		driver.findElement(product3).click();
		driver.findElement(product4).click();
		driver.findElement(product5).click();
		driver.findElement(product6).click();
		
	}
	public void cart() 
	{
		driver.findElement(cart).click();
		
	}
	
	public void checkoutclick() 
	{
		driver.findElement(checkout).click();
		
	}
	public void details(String fn,String ln,String zc)
	{
		driver.findElement(firstname).sendKeys(fn);
		driver.findElement(lastname).sendKeys(ln);
		driver.findElement(zip).sendKeys(fn);
		driver.findElement(cont).click();
		driver.navigate().back();
		
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(harmburg).click();
		Thread.sleep(30);
		driver.findElement(logout).click();
	}

}


