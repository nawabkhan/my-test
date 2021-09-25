package com.jpmc.ukdigitalbank.stepDefinations;


import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.jpmc.ukdigitalbank.pageObjects.GooglePage;
import com.jpmc.ukdigitalbank.pageObjects.ResultPage;
import com.jpmc.ukdigitalbank.utils.DriverUtils;
import com.jpmc.ukdigitalbank.pageObjects.FirstSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	GooglePage gp;
	FirstSearchPage fsp;
	ResultPage rp;
	
	public Steps() throws IOException {
		DriverUtils util = new DriverUtils();
		driver = util.getChromeDriver();
		gp = GooglePage.getInstance(driver);
		fsp = FirstSearchPage.getInstance(driver);
		rp = ResultPage.getInstance(driver);
	}

	@Given("I have open Google url \"([^\"]*)\"$")
	public void i_have_open_Google_url(String url) throws Exception {		
		driver.get(url);
	}
	
	@When("^I add \"([^\"]*)\" to the search box$")
	public void i_add_to_the_search_box(String searchValue) throws Exception {
		gp.enterSearch(searchValue);
	}

	@When("^click the Search Button$")
	public void click_the_Search_Button() throws Exception {
		gp.clickSubmit();
	}

	@When("^click the first result returned by Google$")
	public void click_the_first_result_returned_by_Google() throws Exception {
		fsp.clickFirstResult();
	}

	@Then("^I verify that the \"([^\"]*)\" is shown$")
	public void i_verify_that_the_is_shown(String arg1) throws Exception {
		
		List<WebElement> lst = rp.verifyLogoShown();
		if(lst.isEmpty()) {
			Assert.assertTrue("No logo is shownup ", false);	
		}
		driver.quit();
	}

}
