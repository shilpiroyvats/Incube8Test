package com.pageObjects;

import org.openqa.selenium.WebDriver;

import com.Utilities.GeneralMethods;

public class ImdbLoginOptionsPage {
	
	String CreateAnAccountBtn = "//a[contains(text(),'Account')]";
	
	public void accountClick(WebDriver driver) 
	{
		GeneralMethods.clickAction(CreateAnAccountBtn, driver);
	}

}
