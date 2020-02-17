package com.selenium.interview.lib;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    public void startBrowser(String URL){
        DriverFactory.initializeWebDriver();
        driver = DriverFactory.getWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(URL);
    }

    public void endTest(){
        driver.quit();
        driver = null;
    }
}
