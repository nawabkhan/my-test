package com.jpmc.ukdigitalbank.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	private static ResultPage pageInstance = null;
	public WebDriver driver;

	public static ResultPage getInstance(WebDriver d) {
		if (pageInstance == null)
			pageInstance = new ResultPage(d);
		return pageInstance;
	}

	private ResultPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='img-logo1 col']/img[@alt='J.P. Morgan logo']")
	@CacheLookup
	List<WebElement> listOfElements;

	public List<WebElement> verifyLogoShown() {
		return listOfElements;
	}

}
