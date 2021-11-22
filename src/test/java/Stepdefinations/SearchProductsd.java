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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObject.SearchProduct;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class SearchProductsd extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	SearchProduct sp;

	 @Given("^Launching the browser for sp$")
	    public void launching_the_browser_for_sp() throws Throwable {
    	
		 driver = initializedriver();
    }

	 @When("^hitting the url through config file for sp page$")
	    public void hitting_the_url_through_config_file_for_sp_page() throws Throwable{
    	
    	driver.get(config.geturl());
    }

	 @Then("^search product as (.+) through search box$")
	    public void search_product_as_through_search_box(String product)  throws Throwable {
    	
    	sp = new SearchProduct(driver);
		sp.searchprod().sendKeys(product);
		Thread.sleep(3000);
		Takess.ss(driver);
		sp.searchprod().sendKeys(Keys.ENTER);
		log.info("product has been searched");
    }

    @And("^select the desired product and add it to cart$")
    public void select_the_desired_product_and_add_it_to_cart() throws Throwable {
    	
    	sp.selectprod().click();
		sp.Addtocart().click();
		Takess.ss(driver);
		;
    }

    @And("^quit the driver$")
    public void quit_the_driver() throws Throwable {
    	
    	driver.quit();
    }

}