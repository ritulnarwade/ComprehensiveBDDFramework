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

import PageObject.HomeAndLifestyle;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class HomeAndLifestyleSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	HomeAndLifestyle hl;

    @Given("^Launching the browser for hlpage$")
    public void launching_the_browser_for_hlpage() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for hlpage$")
    public void hitting_the_url_through_config_file_for_hlpage() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^hover to the HomeAndLifestyle and select desired option$")
    public void hover_to_the_homeandlifestyle_and_select_desired_option() throws Throwable {
    	
    	hl = new HomeAndLifestyle(driver);
		WebElement ele= hl.lifestylehover();
    	Actions action = new Actions(driver);
    	action.moveToElement(ele).perform();
    	hl.lamplink().click();
    	Takess.ss(driver);
    	
    }

    @And("^select the HomeAndLifestyle product and add it to the cart$")
    public void select_the_homeandlifestyle_product_and_add_it_to_the_cart() throws Throwable {
    	
    	hl.lampprod().click();
    	hl.addtocart().click();
    	Thread.sleep(3000);
    	Takess.ss(driver);

    }

    @And("^quit the hldriver$")
    public void quit_the_hldriver() throws Throwable {
    	
    	driver.quit();
    }

}
