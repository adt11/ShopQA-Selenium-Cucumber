package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun/failed_scenarios.txt", 
plugin= {"pretty","html:target/site/cucmber-pretty", "json:target/cucumber/cucumber.json", "junit:target/cucumber.xml"},
monochrome = true,
strict = true)
public class FailedRunner {

}
