package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UIStore.WhatsNewUi;

public class WhatsNew extends WhatsNewUi{
	
WebDriver driver;

	
	public WhatsNew(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement NewButton()
	{
		return driver.findElement(button);
	}
	public WebElement Newproduct()
	{
		return driver.findElement(product);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}

}
