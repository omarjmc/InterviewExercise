package com.selenium.interview.cucumber;

import com.selenium.interview.lib.BaseTest;
import com.selenium.interview.pages.AmazonSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CucumberObjects extends BaseTest {

    AmazonSearchPage searchPage = new AmazonSearchPage();

    @Given("User navigates to Amazon page")
    public void userNavigatesToAmazonPage() {
        startBrowser("https://www.amazon.com/ref=nav_logo");
    }

    @When("The user performs a search for (.*)")
    public void theUserPerformsASearchFor(String arg0) {
        searchPage.searchItem(arg0);
        searchPage.clickSearch();
    }
}
