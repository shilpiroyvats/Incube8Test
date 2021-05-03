package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.GeneralMethods;

public class ImdbLandingPage {

	String MenuLoc = "//div[contains(text(),'Menu')]";
	
	String SignIn = "//div[text() = 'Sign In']";
	
	public void menuClick(WebDriver driver) 
	{
		GeneralMethods.clickAction(MenuLoc, driver);
	}
	
	public void selectTopRatedShow(WebDriver driver, String Shows) {
		String TopRatedShow = "//span[contains(text(),'"+ Shows +"')]";
		WebElement ele = driver.findElement(By.xpath(TopRatedShow));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void signInClick(WebDriver driver)
	{
		GeneralMethods.clickAction(SignIn, driver);
	}
	

}
