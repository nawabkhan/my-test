package com.jpmc.ukdigitalbank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstSearchPage {

	private static FirstSearchPage pageInstance = null;
	public WebDriver driver;

	public static FirstSearchPage getInstance(WebDriver d) {
		if (pageInstance == null)
			pageInstance = new FirstSearchPage(d);
		return pageInstance;
	}

	private FirstSearchPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='yuRUbf']/a/h3[text()='J.P. Morgan | Official Website']")
	@CacheLookup
	WebElement firstResult;

	public void clickFirstResult() {
		firstResult.click();
	}

}
