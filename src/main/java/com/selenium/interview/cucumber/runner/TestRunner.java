package com.selenium.interview.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\java\\com\\selenium\\interview\\cucumber\\features",
        glue = "stepdefinitions"
)
public class TestRunner {
}
