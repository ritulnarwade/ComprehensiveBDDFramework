package Stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.textui.TestRunner;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObject.ShopByCategory;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class ShopByCategorySD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	ShopByCategory sb;

    @Given("^Launching the browser for sbcpage$")
    public void launching_the_browser_for_sbcpage() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for sbcpage$")
    public void hitting_the_url_through_config_file_for_sbcpage() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^hover to the ShopByCategory and select desired option$")
    public void hover_to_the_shopbycategory_and_select_desired_option() throws Throwable {
    	
    	sb = new ShopByCategory(driver);
		WebElement ele= sb.ShopByhover();
    	Actions action = new Actions(driver);
    	action.moveToElement(ele).perform();
    	sb.facemasklink().click();
    	Thread.sleep(3000);
    	Takess.ss(driver);
    }

    @And("^select the product and add it to the cart$")
    public void select_the_product_and_add_it_to_the_cart() throws Throwable {
    	
    	sb.facemaskprod().click();
    	sb.addtocart();
    	
    }

    @And("^quit the sbcdriver$")
    public void quit_the_sbcdriver() throws Throwable {
    	
    	driver.quit();
    }

}