package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/",
glue="stepDefinitions",
dryRun=false,
strict = true,
monochrome = true,
tags = {"@Login"},
plugin= {"pretty","html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json","rerun:rerun/failed_scenarios.txt"}
)
public class TestRunner {
	
}
