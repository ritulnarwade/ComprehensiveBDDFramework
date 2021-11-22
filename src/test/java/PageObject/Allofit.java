package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.AllofitUi;

public class Allofit extends AllofitUi{
	
WebDriver driver;

	
	public Allofit(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement allofit()
	{
		return driver.findElement(allofit);
	}
	public WebElement allofitprod()
	{
		return driver.findElement(product);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}
	public WebElement gettext()
	{
		return driver.findElement(text);
	}

}
