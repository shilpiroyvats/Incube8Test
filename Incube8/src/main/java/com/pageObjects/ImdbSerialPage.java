package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import com.Utilities.GeneralMethods;
import com.stepDefinitions.Scenario1;

public class ImdbSerialPage {
	
	private static Logger log = Logger.getLogger(ImdbSerialPage.class);

	String ratingValueLoc = "//span[@itemprop = 'ratingValue']";
	
	String ratingCountLoc = "//span[@itemprop = 'ratingCount']";
	
	public void selectSerial(WebDriver driver, String Serial_Name)
	{
		String SerialLoc = "//a[text()='"+ Serial_Name +"']";
		GeneralMethods.clickAction(SerialLoc, driver);
	}
	
	public void assertTitle(WebDriver driver, String title)
	{
		String aTitle = driver.getTitle();
		log.info("Actual title of the page is :" +aTitle);
		GeneralMethods.assertTest(aTitle, title);
	}
	
	public void assertValue(WebDriver driver, String ratingValue)
	{
		String aValue = driver.findElement(By.xpath(ratingValueLoc)).getText();
		log.info("Actual RatingValue of the Serial is :" +aValue);
		GeneralMethods.assertTest(aValue, ratingValue);
	}
	
	public void assertCount(WebDriver driver, String ratingCount)
	{
		String aCount = driver.findElement(By.xpath(ratingCountLoc)).getText();
		log.info("Actual RatingCount of the Serial is :" +aCount);
		GeneralMethods.assertTest(aCount, ratingCount);
	}

}
