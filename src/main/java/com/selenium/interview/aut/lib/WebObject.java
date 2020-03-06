package com.selenium.interview.aut.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebObject {

    private String ElementLocator;
    private String LocatorUsed;
    private String LocatorMethod;
    private By ActualLocator;

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

        ActualLocator = null;

        if(LocatorMethod.equals("xpath")){
            ActualLocator = By.xpath(LocatorUsed);
        }else if(LocatorMethod.equals("cssSelector")) {
            ActualLocator = By.cssSelector(LocatorUsed);
        }else if(LocatorMethod.equals("id")){
            ActualLocator = By.id(LocatorUsed);
        }else if(LocatorMethod.equals("name")){
            ActualLocator = By.name(LocatorUsed);
        }else if(LocatorMethod.equals("className")){
            ActualLocator = By.className(LocatorUsed);
        }else if(LocatorMethod.equals("linkText")){
            ActualLocator = By.linkText(LocatorUsed);
        }else if(LocatorMethod.equals("partialLinkText")){
            ActualLocator = By.partialLinkText(LocatorUsed);
        }else if(LocatorMethod.equals("tagName")){
            ActualLocator = By.tagName(LocatorUsed);
        }

        return ActualLocator;
    }

    public By getActualLocator(){
        getLocator();

        return ActualLocator;
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
