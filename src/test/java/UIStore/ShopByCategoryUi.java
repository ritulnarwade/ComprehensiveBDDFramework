package UIStore;

import org.openqa.selenium.By;

public class ShopByCategoryUi {
	
	public static By shophover = By.xpath("//a[@data-dropdown-rel='shop-by-category']");
	public static By facemasks = By.linkText("Face Masks");
	public static By maskproduct = By.xpath("//*[@id=\'CollectionAjaxContent\']/div/div[1]/div/a/div[2]/div[1]");
	public static By addtocart = By.xpath("//button[@type='submit']");

}
