package UIStore;

import org.openqa.selenium.By;

public class CorporateGiftsUi {
	
	public static By corporategifts = By.xpath("//a[@data-dropdown-rel='corporate-gifts']");
	public static By name = By.id("contactFormName");
	public static By email = By.id("contactFormEmail");
	public static By phone = By.id("contactFormPhone");
	public static By submit = By.xpath("//*[@id=\'contactFormWrapper\']/div/input[4]");

}
