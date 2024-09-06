package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import basepkg.baseclass;

import pagepkg.saucepage;
import utilities.exelutilities;



public class saucetest extends baseclass {
	@Test
	public void verifyLoginWithValidCred() throws InterruptedException
	{
		saucepage p1=new saucepage(driver);
		String xl="C:\\Users\\Emily\\Desktop\\Book1.xlsx";
		String Sheet="Sheet2";
		int rowCount=exelutilities.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
	
			String Username=exelutilities.getCellValues(xl, Sheet, i, 0);
			System.out.println("username----"+Username);
			
			String Password=exelutilities.getCellValues(xl, Sheet, i, 1);
			System.out.println("password----"+Password);
			
			
			p1.setvalues(Username, Password);
			p1.login();
			
			driver.navigate().refresh();
		}
			Thread.sleep(30);
			p1.Products();
			Thread.sleep(30);
			p1.cart();
			Thread.sleep(30);
			p1.checkoutclick();
			Thread.sleep(30);
			p1.details("Emily", "Thomas", "685509");
			Thread.sleep(30);
			p1.logout();
//			
			//driver.navigate().back();
			
			
		}
	}
	
	



