package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.HomeAndLifestyleUi;

public class HomeAndLifestyle extends HomeAndLifestyleUi{
	
WebDriver driver;

	
	public HomeAndLifestyle(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement lifestylehover()
	{
		return driver.findElement(lifestylehover);
	}
	public WebElement lamplink()
	{
		return driver.findElement(lamps);
	}
	public WebElement lampprod()
	{
		return driver.findElement(lampproduct);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}
	

}
