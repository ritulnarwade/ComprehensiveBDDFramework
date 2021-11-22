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

import PageObject.OfficialMerchandise;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class OfficialMerchandiseSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	OfficialMerchandise om;

    @Given("^Launching the browser for ompage$")
    public void launching_the_browser_for_ompage() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for ompage$")
    public void hitting_the_url_through_config_file_for_ompage() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^hover to the OfficialMerchandise and select desired option$")
    public void hover_to_the_officialmerchandise_and_select_desired_option() throws Throwable {
    	
    	om = new OfficialMerchandise(driver);
		WebElement ele= om.merchandisehover();
    	Actions action = new Actions(driver);
    	action.moveToElement(ele).perform();
    	om.batmanlink().click();
    	Thread.sleep(3000);
    	Takess.ss(driver);
    }

    @And("^select the OfficialMerchandise product$")
    public void select_the_officialmerchandise_product() throws Throwable {
    	
    	om.batmanproduct().click();
    	log.info("Merchandise product is selected");

    	
    }

    @And("^quit the omdriver$")
    public void quit_the_omdriver() throws Throwable {
    	driver.quit();
    }

}