package com.jpmc.ukdigitalbank.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//features/search.features", glue = "com.jpmc.ukdigitalbank.stepDefinations", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:test-report" })
public class Runner {

}
