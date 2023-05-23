package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
* 3.DashboardPage - Dashboard text Locator and create appropriate methods for it.
*/
public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//h6[normalize-space()='Dashboard']")
    WebElement  dashboardText ;
    public String getDashboardText(){return getTextFromElement(dashboardText);}
}
