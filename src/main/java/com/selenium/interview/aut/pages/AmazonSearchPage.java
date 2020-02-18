package com.selenium.interview.aut.pages;

import com.selenium.interview.aut.lib.PropertyReader;
import com.selenium.interview.aut.lib.WebObject;

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
