package com.Utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GeneralMethods {

	public static Properties readPropertiesFile() throws IOException {
		FileReader reader = new FileReader("property.properties");
		Properties p = new Properties();
		p.load(reader);
		return p;
	}

	public static void clickAction(String ele, WebDriver driver) {
		driver.findElement(By.xpath(ele)).click();
	}

	public static void sendValue(String ele, WebDriver driver, String key) {
		driver.findElement(By.xpath(ele)).sendKeys(key);
		;
	}

	public static void assertTest(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public static void setDriverPath() throws IOException {
		Properties prop = readPropertiesFile();
		String keyword = prop.getProperty("Keyword");
		String DriverPath = prop.getProperty("DriverPath");
		System.setProperty(keyword, DriverPath);
	}

	public static void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void getUrl(WebDriver driver) throws IOException {
		Properties prop = readPropertiesFile();
		String url = prop.getProperty("URL");
		driver.get(url);
	}
}
