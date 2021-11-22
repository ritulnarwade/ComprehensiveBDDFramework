package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.PersonalizedGiftsUi;

public class PersonalizedGifts extends PersonalizedGiftsUi{
	
WebDriver driver;

	
	public PersonalizedGifts(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement pgiftslink()
	{
		return driver.findElement(personalgifts);
	}
	public WebElement productlink()
	{
		return driver.findElement(product);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}
	

}
