package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.CorporateGiftsUi;

public class CorporateGifts extends CorporateGiftsUi{
	
WebDriver driver;

	
	public CorporateGifts(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement cglink()
	{
		return driver.findElement(corporategifts);
	}

	public WebElement getname()
	{
		return driver.findElement(name);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getphone()
	{
		return driver.findElement(phone);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	

}
