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

import PageObject.PersonalizedGifts;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class PersonalizedGiftsSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	PersonalizedGifts p;

    @Given("^Launching the browser for PersonalizedGifts$")
    public void launching_the_browser_for_personalizedgifts() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for PersonalizedGifts$")
    public void hitting_the_url_through_config_file_for_personalizedgifts() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^click on the Personalized Gifts$")
    public void click_on_the_personalized_gifts() throws Throwable {
    	
    	p = new PersonalizedGifts(driver);
		p.pgiftslink().click();
    }

    @And("^select the product from Personalized Gifts section$")
    public void select_the_product_from_personalized_gifts_section() throws Throwable {
    	
    	p.productlink().click();
		p.addtocart().click();
		Thread.sleep(3000);
		log.info("Personalized gift is added to cart");
		Takess.ss(driver);
    }

    @And("^quit the pgdriver$")
    public void quit_the_pgdriver() throws Throwable {
    	driver.quit();
    }

}