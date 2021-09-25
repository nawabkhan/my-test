package com.jpmc.ukdigitalbank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	private static GooglePage pageInstance = null;
	public WebDriver driver;
	
	public static GooglePage getInstance(WebDriver d)
    {
        if (pageInstance == null)
        	pageInstance = new GooglePage(d);
        return pageInstance;
    }
	
	private GooglePage(WebDriver d) {
		driver =d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text'][@name='q']")
	@CacheLookup
	WebElement searchBox;
	
	@FindBy(xpath = "//div[@class='lJ9FBc']//center/input[@value='Google Search']")
	@CacheLookup
	WebElement submitBtn;
	
	public void enterSearch(String searchValue) {
		searchBox.clear();
		searchBox.sendKeys(searchValue);
		searchBox.click();
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
	
	
	
	
	
	
	
	

}
