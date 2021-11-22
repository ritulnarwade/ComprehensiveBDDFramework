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
import org.openqa.selenium.support.ui.Select;

import PageObject.ChristmasGifts;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class ChristmasGiftsSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	ChristmasGifts ch;

    @Given("^Launching the browser for ChristmasGifts$")
    public void launching_the_browser_for_christmasgifts() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for ChristmasGifts$")
    public void hitting_the_url_through_config_file_for_christmasgifts() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^click on the Christmas Gifts$")
    public void click_on_the_christmas_gifts() throws Throwable {
    	ch = new ChristmasGifts(driver);
		ch.chrisgifts().click();
		
		Takess.ss(driver);
    }
    
    @And("^select option from featured dropdown$")
    public void select_option_from_featured_dropdown() throws Throwable {
    	
    	Select featured = new Select(ch.dropdown());
		featured.selectByValue("title-ascending");
		Thread.sleep(3000);
		Takess.ss(driver);
    }

    @Then("^select christmas product$")
    public void select_christmas_product() throws Throwable {
    	
    	ch.product().click();
    	Thread.sleep(3000);
    	Takess.ss(driver);
    	log.info("Christmas Gift added to cart");
    	
    	
    }

    

    @And("^quit the christmasgifts driver$")
    public void quit_the_christmasgifts_driver() throws Throwable {
    	
    	driver.quit();
    }

}