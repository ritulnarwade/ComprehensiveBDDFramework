package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.BirthdayGiftsUi;

public class BirthdayGifts extends BirthdayGiftsUi {
	
WebDriver driver;

	
	public BirthdayGifts(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement hover()
	{
		return driver.findElement(hover);
	}
	public WebElement gifts()
	{
		return driver.findElement(kidsgift);
	}
	public WebElement mug()
	{
		return driver.findElement(mug);
	}
	public WebElement addtocart()
	{
		return driver.findElement(cart);
	}


}
