package com.selenium.interview.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebObject {

    public String ElementLocator;
    public String LocatorUsed;
    public String LocatorMethod;

    public WebDriver driver = DriverFactory.getWebDriver();

    public WebObject(String locator){
        ElementLocator = locator;
    }

    private void locatorParser(){
        int pos1, pos2, pos3;

        pos1 = ElementLocator.indexOf('(');
        pos2 = ElementLocator.indexOf(')');
        pos3 = ElementLocator.indexOf('.');

        LocatorUsed = ElementLocator.substring(pos1 + 2, pos2 - 1);
        LocatorMethod = ElementLocator.substring(pos3 + 1, pos1);
    }

    private By getLocator(){

        locatorParser();

        By actualLocator = null;

        if(LocatorMethod.equals("xpath")){
            actualLocator = By.xpath(LocatorUsed);
        }else if(LocatorMethod.equals("cssSelector")) {
            actualLocator = By.cssSelector(LocatorUsed);
        }else if(LocatorMethod.equals("id")){
            actualLocator = By.id(LocatorUsed);
        }else if(LocatorMethod.equals("name")){
            actualLocator = By.name(LocatorUsed);
        }else if(LocatorMethod.equals("className")){
            actualLocator = By.className(LocatorUsed);
        }else if(LocatorMethod.equals("linkText")){
            actualLocator = By.linkText(LocatorUsed);
        }else if(LocatorMethod.equals("partialLinkText")){
            actualLocator = By.partialLinkText(LocatorUsed);
        }else if(LocatorMethod.equals("tagName")){
            actualLocator = By.tagName(LocatorUsed);
        }

        return actualLocator;
    }

    public WebElement createWebElement(){
        return driver.findElement(getLocator());
    }

    public List<WebElement> createWebElementsList(){
        return driver.findElements(getLocator());
    }

    public Select createSelectElement(){
        return new Select(driver.findElement(getLocator()));
    }
}
