package com.selenium.interview.pages;

import com.selenium.interview.lib.PropertyReader;
import com.selenium.interview.lib.WebObject;

public class AmazonSearchPage {

    WebObject SearchBar = new WebObject(PropertyReader.getProperty("AmazonSearch.properties", "SearchBar"));
    WebObject SearchButton = new WebObject(PropertyReader.getProperty("AmazonSearch.properties", "SearchButton"));

    public void searchItem(String item){
        SearchBar.createWebElement().sendKeys(item);
    }

    public void clickSearch(){
        SearchButton.createWebElement().click();
    }
}
