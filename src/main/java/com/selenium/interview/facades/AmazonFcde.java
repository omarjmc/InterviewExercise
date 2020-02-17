package com.selenium.interview.facades;

import com.selenium.interview.pages.AmazonSearchPage;

public class AmazonFcde {

    AmazonSearchPage searchPage = new AmazonSearchPage();

    public void searchItem(String item){
        searchPage.searchItem(item);
        searchPage.clickSearch();
    }
}
