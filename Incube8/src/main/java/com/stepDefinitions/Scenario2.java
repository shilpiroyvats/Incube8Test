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
import com.pageObjects.ImdbLoginOptionsPage;
import com.pageObjects.ImdbNewUserPage;
import com.pageObjects.ImdbSearchResultPage;
import com.pageObjects.ImdbSerialPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Scenario2  {
	 
	public WebDriver driver;
	private static Logger log = Logger.getLogger(Scenario2.class);
	
	@Given("^User launches the IMDb application on the browser$")
	public void launchApplication() throws IOException {
		ImdbLandingPage obj = new ImdbLandingPage();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		GeneralMethods.getUrl(driver);
	}
	
	@And("^the user clicks on the sign in button$")
	public void clickOnSignIn()
	{
		ImdbLandingPage obj = new ImdbLandingPage();
		obj.signInClick(driver);
	}
	
	@And("^the user decides to create a new Account$")
	public void createAccount()
	{
		ImdbLoginOptionsPage obj = new ImdbLoginOptionsPage();
		obj.accountClick(driver);
	}
	
	@And("^the user enters \"([^\"]*)\" and \"([^\"]*)\" to register$")
	public void enterDetails(String Name, String Email_Address)
	{
		ImdbNewUserPage obj = new ImdbNewUserPage();
		obj.sendName(driver, Name);
		obj.sendEmail(driver, Email_Address);
	}
	
	@And("^the user enters \"([^\"]*)\" password$")
	public void enterPassword(String Password)
	{
		ImdbNewUserPage obj = new ImdbNewUserPage();
		obj.sendPassword(driver, Password);
	}
	
    @And("^the user re-enters the \"([^\"]*)\" password$")
    public void reEnterPassword(String Password)
    {
    	ImdbNewUserPage obj = new ImdbNewUserPage();
    	obj.verifyPassword(driver, Password);
    }
    
    @Then("^the user clicks on create your Imdb Account$")
    public void createAnAccount()
    {
    	ImdbNewUserPage obj = new ImdbNewUserPage();
    	obj.clickContinue(driver);
    }
    
    @And("^user closes the browser$")
    public void closeBrowser()
    {
    	driver.close();
    }
	
}
