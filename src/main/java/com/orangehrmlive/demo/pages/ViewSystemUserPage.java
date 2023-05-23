package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 5.ViewSystemUsersPage - System Users Text, Username Field, User Roll dropDown,
 * Employee Name Field,
 * Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and
 * it's actions
 */
public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());

    public ViewSystemUserPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//h5[normalize-space()='System Users']")
    WebElement systemUserText ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement employeeNameSystem ;
    @CacheLookup
    @FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement userNameSystem ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selectUserRoleSystem ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]")
    WebElement userRoleAdmin ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
    WebElement statusSystem ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]")
    WebElement disableSystem ;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Search']")
    WebElement searchButton ;
    @CacheLookup
    @FindBy(xpath="//div[@role='option']")
    WebElement employeeDropdown ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")
    WebElement resetButton ;

    public String getsystemUserText(){
        log.info("Get system user text "+systemUserText.toString());
        return getTextFromElement(systemUserText);
    }
    public void sendUserNameSystem(String username) {
        log.info("Enter User name  "+ userNameSystem.toString());
        sendTextToElement(userNameSystem,username);
    }
    public void clickOnSelectRoleSystemDropdown(){
        log.info("Click on select role system "+ selectUserRoleSystem.toString());
        clickOnElement(selectUserRoleSystem);
    }
    public void clickOnAdminSystem() {
        log.info("Click on Admin system "+userRoleAdmin.toString());
        mouseHoverToElementAndClick(userRoleAdmin);
    }
    public void clickOnSearchButton() {
        log.info("Click on search button "+searchButton.toString());
        clickOnElement(searchButton);
    }
    public void clickOnSatusSystem() {
        log.info("Click on status system "+statusSystem.toString());
        clickOnElement(statusSystem);
    }
    public void clickOnDisableSystem(){
        log.info("Click on Disable System "+disableSystem.toString());
        clickOnElement(disableSystem);
    }

    public void sendEmployeeName(String empName){
        log.info("Enter Employee name "+employeeNameSystem.toString());
        sendTextToElement(employeeNameSystem,empName);

    }
    public void clickOnEmployeeNameOption(){

        log.info("Click on Employee name option "+employeeDropdown.toString());
        mouseHoverToElementAndClick(employeeDropdown);

    }
    public void clickOnResetButton(){
        log.info("Click on reset button "+ resetButton.toString());
        clickOnElement(resetButton);
    }

}
