package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
*2. HomePage - Store OrangeHRM logo, Admin, PIM,Time ,Dashboard,Myinfo,Recruitment, Dashboard Text
locatores  and create appropriate methods for it.
*/
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]")
    WebElement orangeHRMLogoOnHomePage;
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement searchTextBoxOnHomepage ;
    @CacheLookup
    @FindBy(xpath= "//span[normalize-space()='Admin']")
    WebElement adminOptionOnLeftHomePage ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    WebElement PIMOnLeftHomePage ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]")
    WebElement dashboardOptionOnLeftHomePage ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
    WebElement timeOptionOnHomePage ;
    public boolean isSearchBoxVisible(){
        log.info(" Is searchbox visible "+ searchTextBoxOnHomepage.toString());
        return  isElementVisible(searchTextBoxOnHomepage);
    }
    public boolean isAdminOptionVisible(){
        log.info("is Admin option visible "+adminOptionOnLeftHomePage.toString());
        return isElementVisible(adminOptionOnLeftHomePage);
    }
    public boolean isPIMOptionVisible(){
        log.info("is PIM option visible "+PIMOnLeftHomePage.toString());
        return isElementVisible(PIMOnLeftHomePage);
    }
    public boolean isDashboardOptionVisible(){
        log.info(" is Dashboard option visible "+dashboardOptionOnLeftHomePage.toString());
        return isElementVisible(dashboardOptionOnLeftHomePage);
    }
    public boolean isLeaveOptionVisible(){
        log.info(" is leave option visible "+ timeOptionOnHomePage.toString());
        return isElementVisible(timeOptionOnHomePage);
    }
}
