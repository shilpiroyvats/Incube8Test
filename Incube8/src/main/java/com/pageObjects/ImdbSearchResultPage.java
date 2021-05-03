package com.pageObjects;

import org.openqa.selenium.WebDriver;

import com.Utilities.GeneralMethods;

public class ImdbSearchResultPage {
	
	String SearchLoc = "//input[contains(@placeholder,'IMDb')]";
	
	String SearchLens = "//button[contains(@id,'suggestion')]";
		
	public void searchResult(WebDriver driver, String showName) {
		GeneralMethods.sendValue(SearchLoc, driver, showName);
	}
	
	public void clickSearchLens(WebDriver driver)
	{
		GeneralMethods.clickAction(SearchLens, driver);
	}

}
