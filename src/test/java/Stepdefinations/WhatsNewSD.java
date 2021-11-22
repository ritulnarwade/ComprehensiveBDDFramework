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

import PageObject.WhatsNew;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class WhatsNewSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	WhatsNew w;

    @Given("^Launching the browser for whatsnewpage$")
    public void launching_the_browser_for_whatsnewpage() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for whatsnew page$")
    public void hitting_the_url_through_config_file_for_whatsnew_page() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^click on the WhatsNew$")
    public void click_on_the_whatsnew() throws Throwable {
    	w = new WhatsNew(driver);
		w.NewButton().click();
		Thread.sleep(3000);
		Takess.ss(driver);

    }

    @And("^select the product from WhatsNew option$")
    public void select_the_product_from_whatsnew_option() throws Throwable {
    	
    	w.Newproduct().click();
		w.addtocart().click();
		log.info("product has been added through WhatsNew link");
    }

    @And("^quit the WhatsNew driver$")
    public void quit_the_whatsnew_driver() throws Throwable {
    	driver.quit();
    }

}