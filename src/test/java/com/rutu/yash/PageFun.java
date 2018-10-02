package com.rutu.yash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFun {
	
	WebDriver driver;
	Actions builder;
	Alert alert;

	@FindBy(linkText = "Fashion")
	public static WebElement fashionNWindow;
	
	@FindBy(linkText = "Jewelry")
	public static WebElement jewelry;
	
	@FindBy(xpath = ".//*[@id='content']/p[8]/button")
	public static WebElement popUpText;
	
	@FindBy(xpath = ".//*[@id='w1-w1']/ul/li[1]")
	public static WebElement attribute;
	
	@FindBy(linkText = "Advertising")
	public static WebElement advertising;
	

	public void getEnvironmentReady() {
		driver = new FirefoxDriver();
		builder = new Actions(driver);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public String testAction() {
		builder.moveToElement(fashionNWindow).build().perform();
		jewelry.click();
		return driver.getTitle();
	}

	public void openPage(String webPage) {
		driver.get(webPage);	
	}


	public void closePage() {
		driver.quit();
	}

	public String alertTest() {
		popUpText.sendKeys(Keys.ENTER);
		alert =  driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	public String attributeTest() {
		return attribute.getAttribute("href");
	}

	public String backForTest() {
		String titles = driver.getTitle();
		advertising.click();
		titles += driver.getTitle();
		driver.navigate().back();
		titles += driver.getTitle();
		driver.navigate().forward();
		titles += driver.getTitle();
		return titles;
	}

	public String dragnDropTest() {
		String text = "xyz";
		return null;
	}

}
