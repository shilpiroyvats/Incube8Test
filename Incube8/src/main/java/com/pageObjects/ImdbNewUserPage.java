package com.pageObjects;

import org.openqa.selenium.WebDriver;

import com.Utilities.GeneralMethods;

public class ImdbNewUserPage {

	String nameLoc = "//input[contains(@id,'customer_name')]";
	
	String emailLoc = "//input[contains(@id,'ap_email')]";
	
	String passwordLoc = "//input[contains(@id,'ap_password')]";
	
	String reTypePassLoc = "//input[contains(@id,'ap_password_check')]";
	
	String continueLoc = "//input[contains(@id,'continue')]";
	
	public void sendName(WebDriver driver, String name)
	{
		GeneralMethods.sendValue(nameLoc, driver, name);
	}
	
	public void sendEmail(WebDriver driver, String email)
	{
		GeneralMethods.sendValue(emailLoc, driver, email);
	}
	
	public void sendPassword(WebDriver driver, String password)
	{
		GeneralMethods.sendValue(passwordLoc, driver, password);
	}
	
	public void verifyPassword(WebDriver driver, String password)
	{
		GeneralMethods.sendValue(reTypePassLoc, driver, password);
	}
	
	public void clickContinue(WebDriver driver)
	{
		GeneralMethods.clickAction(continueLoc, driver);
	}
}
