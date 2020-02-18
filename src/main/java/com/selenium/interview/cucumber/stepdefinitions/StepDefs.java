package com.selenium.interview.cucumber.stepdefinitions;

import com.selenium.interview.aut.facades.AmazonFcde;
import com.selenium.interview.aut.lib.BaseTest;
import io.cucumber.java.en.*;

public class StepDefs extends BaseTest {

    AmazonFcde amazonFcde = new AmazonFcde();

    @Given("^User navigates to Amazon page$")
    public void user_navigates_to_Amazon_page() {
        startBrowser("https://www.amazon.com/ref=nav_logo");
    }

    @When("^The user performs a search for (.*)$")
    public void the_user_performs_a_search_for_HP_Printer(String item) {
        amazonFcde.searchItem(item);
    }

    @When("^Close browser$")
    public void close_browser() {
        endTest();
    }

}
