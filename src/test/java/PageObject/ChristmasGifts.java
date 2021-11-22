package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.ChristmasGiftsUi;

public class ChristmasGifts extends ChristmasGiftsUi{
	
WebDriver driver;

	
	public ChristmasGifts(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement chrisgifts()
	{
		return driver.findElement(chrisgifts);
	}
	
	public WebElement dropdown()
	{
		return driver.findElement(dropdown);
	}
	public WebElement product()
	{
		return driver.findElement(product);
	}
	

}
