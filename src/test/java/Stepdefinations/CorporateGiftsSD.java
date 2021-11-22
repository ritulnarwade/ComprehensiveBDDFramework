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

import PageObject.CorporateGifts;
import ReusableComponent.WebDriverHelper;
import Utility.Takess;

@RunWith(Cucumber.class)
public class CorporateGiftsSD extends WebDriverHelper{
	
	static WebDriver driver = null;
	static Logger log = Logger.getLogger(TestRunner.class.getName());
	CorporateGifts cg;

    @Given("^Launching the browser for CorporateGifts$")
    public void launching_the_browser_for_corporategifts() throws Throwable {
    	
		 driver = initializedriver();

    }

    @When("^hitting the url through config file for CorporateGifts$")
    public void hitting_the_url_through_config_file_for_corporategifts() throws Throwable {
    	
    	driver.get(config.geturl());

    }

    @Then("^click on the CorporateGifts Gifts$")
    public void click_on_the_corporategifts_gifts() throws Throwable {
    	
    	cg = new CorporateGifts(driver);
		cg.cglink().click();
		Takess.ss(driver);
    }
    
    @And("^Enter email,name,phoneno$")
    public void enter_emailnamephoneno() throws Throwable {
    	
    	cg.getname().sendKeys("abc");
		cg.getemail().sendKeys("abc@gmail.com");
		cg.getphone().sendKeys("123456");
		Thread.sleep(3000);
		Takess.ss(driver);
    }
    @Then("^click on submit$")
    public void click_on_submit() throws Throwable {
    	
    	cg.submit().click();
    	log.info("corporate gift details are submitted");
    }

   

    @And("^quit the cgdriver$")
    public void quit_the_cgdriver() throws Throwable {
    	driver.quit();
    }

}