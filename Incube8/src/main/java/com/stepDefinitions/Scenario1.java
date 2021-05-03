package com.stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.Utilities.GeneralMethods;
import com.pageObjects.ImdbLandingPage;
import com.pageObjects.ImdbSearchResultPage;
import com.pageObjects.ImdbSerialPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Scenario1  {
	 
	public WebDriver driver;
	private static Logger log = Logger.getLogger(Scenario1.class);
	
	@Before
    public void beforeScenario() throws IOException{
		GeneralMethods.setDriverPath();
    }	
	
	@Given("^User launches the IMDb application$")
	public void launchApplication() throws IOException {
		ImdbLandingPage obj = new ImdbLandingPage();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		GeneralMethods.getUrl(driver);
		obj.menuClick(driver);
	}
	
	@And("^click on the \"([^\"]*)\" from the dropdown menu$")
	public void clickOnMenu(String shows) {
		ImdbLandingPage obj = new ImdbLandingPage();
		obj.selectTopRatedShow(driver, shows);
	}
	
	@When("^I search for a \"([^\"]*)\" to fetch the results$")
	public void search(String showName)
	{
		ImdbSearchResultPage obj = new ImdbSearchResultPage();
		obj.searchResult(driver, showName);
		obj.clickSearchLens(driver);
		
	}
	@And("^click on the \"([^\"]*)\" of your choice$")
	public void serial_name(String Serial_Name)
	{
		ImdbSerialPage obj = new ImdbSerialPage();
		obj.selectSerial(driver, Serial_Name);
	}
    @Then("^I validate the Title \"([^\"]*)\" of the page$")
    public void titleAssertion(String Title)
	{
    	ImdbSerialPage obj = new ImdbSerialPage();
    	obj.assertTitle(driver, Title);
		
	}
    @And("^I validate the RatingValue \"([^\"]*)\" of the serial$")
    public void ratingValueAssertion(String RatingValue)
	{
    	ImdbSerialPage obj = new ImdbSerialPage();
    	obj.assertValue(driver, RatingValue);
		
	}
    @And("^I validate the RatingCount \"([^\"]*)\" of the \"([^\"]*)\"$")
    public void ratingCountAssertion(String RatingCount, String Serial_Name)
  	{
    	ImdbSerialPage obj = new ImdbSerialPage();
    	log.info("The name of the serial is :" +Serial_Name);
    	obj.assertCount(driver, RatingCount);
  	}
    
    @And("^I close the browser$")
    public void closeBrowser()
    {
    	driver.close();
    }
}
