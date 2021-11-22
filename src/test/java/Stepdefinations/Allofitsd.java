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
import org.testng.Assert;

import PageObject.Allofit;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;


@RunWith(Cucumber.class)
public class Allofitsd extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	Allofit a;

    @Given("^Launching the browser$")
    public void launching_the_browser() throws Throwable {
		
    	driver = initializedriver();
	
    }

    @When("^hitting the url through config file$")
    public void hitting_the_url_through_config_file() throws Throwable {
    	
    	driver.get(config.geturl());
    }

    @Then("^click on allofit link$")
    public void click_on_allofit_link() throws Throwable {
    	
    	a = new Allofit(driver);
		a.allofit().click();
    }
    
    @And("^select product$")
    public void select_product() throws Throwable {
    	
    	a.allofitprod().click();
    	Takess.ss(driver);
    }

    @Then("^verify the title of product and add it to the cart$")
    public void verify_the_title_of_product_and_add_it_to_the_cart() throws Throwable {
    	if(a.gettext().getText().contains("Vintage Window Photo Frame"))
		{
			Assert.assertTrue(true);
			log.info("Title Verified successfully");
			
		}
		else
		{
			Assert.assertFalse(false);
			log.info("Title has not verified");
			
		}
    	a.addtocart().click();
    	log.info("product added to the cart");
    	
    	driver.quit();

    	
    }

 

  
}