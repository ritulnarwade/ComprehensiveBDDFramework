package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.ShopByCategoryUi;

public class ShopByCategory extends ShopByCategoryUi{
	
WebDriver driver;

	
	public ShopByCategory(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement ShopByhover()
	{
		return driver.findElement(shophover);
	}
	
	public WebElement facemasklink()
	{
		return driver.findElement(facemasks);
	}
	public WebElement facemaskprod()
	{
		return driver.findElement(maskproduct);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}

}
