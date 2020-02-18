package com.selenium.interview.aut.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver webDriver = null;

    public static void initializeWebDriver(){
        if(webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
        }
    }

    public static WebDriver getWebDriver(){
        if(webDriver == null){
            initializeWebDriver();
        }
        return webDriver;
    }

}
