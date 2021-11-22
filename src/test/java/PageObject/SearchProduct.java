package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.SearchProductUi;

public class SearchProduct extends SearchProductUi{
	
	WebDriver driver;

	
	public SearchProduct(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement searchprod()
	{
		return driver.findElement(searchbox);
	}
	public WebElement selectprod()
	{
		return driver.findElement(harrypotter);
	}
	public WebElement Addtocart()
	{
		return driver.findElement(addtocartbutton);
	}


}
