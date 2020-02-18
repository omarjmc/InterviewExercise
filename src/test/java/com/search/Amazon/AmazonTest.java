package com.search.Amazon;

import com.selenium.interview.aut.facades.AmazonFcde;
import com.selenium.interview.aut.lib.BaseTest;
import org.testng.annotations.*;

public class AmazonTest extends BaseTest {

    AmazonFcde amazonFcde = new AmazonFcde();

    @BeforeTest
    public void setUp(){
        startBrowser("https://www.amazon.com/ref=nav_logo");
    }

    @Test
    public void SearchAmazon(){
        amazonFcde.searchItem("HP printer");
    }

    @AfterTest
    public void tearDown(){
        endTest();
    }
}
