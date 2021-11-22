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

import PageObject.BirthdayGifts;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class BirthdayGiftsSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	BirthdayGifts bg;

    @Given("^Launching the browser for bgpage$")
    public void launching_the_browser_for_bgpage() throws Throwable {

    	driver = initializedriver();

    }

    @When("^hitting the url through config file for bgpage$")
    public void hitting_the_url_through_config_file_for_bgpage() throws Throwable {
    	
    	driver.get(config.geturl());
    }

    @Then("^hover to the BirthdayGifts and select desired option$")
    public void hover_to_the_birthdaygifts_and_select_desired_option() throws Throwable {
    	
    	bg = new BirthdayGifts(driver);
		WebElement ele= bg.hover();
    	Actions action = new Actions(driver);
    	action.moveToElement(ele).perform();
    	bg.gifts().click();
    	Takess.ss(driver);
    	
    	
    }

    @And("^select product and add it to the cart$")
    public void select_product_and_add_it_to_the_cart() throws Throwable {
    	
     	bg.mug().click();
    	bg.addtocart().click();
    	log.info("birthday gift added to the cart");
    	Takess.ss(driver);
    }

    @And("^quit the bgdriver$")
    public void quit_the_bgdriver() throws Throwable {
    	driver.quit();
    }

}