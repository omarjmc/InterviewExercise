package com.selenium.interview.aut.facades;

import com.selenium.interview.aut.pages.AmazonSearchPage;

public class AmazonFcde {

    AmazonSearchPage searchPage = new AmazonSearchPage();

    public void searchItem(String item){
        searchPage.searchItem(item);
        searchPage.clickSearch();
    }
}
