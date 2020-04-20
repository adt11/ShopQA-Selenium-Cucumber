package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions.Base;
import stepDefinitions.BaseClass;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/",
glue="stepDefinitions",
dryRun=false,
strict = true,
monochrome = true,
tags = {"@Checkout"},
plugin= {"pretty","html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json","rerun:rerun/failed_scenarios.txt"}
)
public class TestRunner extends Base{
	
	@BeforeClass
	public static void initDriver() {
		
		System.out.println(" Starting of driver ");
		driver = BaseClass.createDriver();
	}
	
	@AfterClass
	public static void exitDriver() {
		
		System.out.println(" Exiting driver ");
		driver.close();
	}
	
}
