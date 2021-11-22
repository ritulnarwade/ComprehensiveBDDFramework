package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.OfficialMerchandiseUi;

public class OfficialMerchandise extends OfficialMerchandiseUi{
	
WebDriver driver;

	
	public OfficialMerchandise(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement merchandisehover()
	{
		return driver.findElement(merchandisehover);
	}
	
	public WebElement batmanlink()
	{
		return driver.findElement(batmanlink);
	}
	
	public WebElement batmanproduct()
	{
		return driver.findElement(batmanproduct);
	}
	

}
