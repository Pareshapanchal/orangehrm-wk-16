package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
* 4.AdminPage - UserManagement, Job, Organization Tabs Locators and it's actions
 */
public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='User Management']")
    WebElement userManagementOptionOnTopMenu;
    @CacheLookup
    @FindBy(linkText = "Users")
    WebElement userOptionInUserManagement;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='Admin']")
    WebElement admin ;
    @CacheLookup
    @FindBy(xpath="//h6[normalize-space()='User Management']")
    WebElement userManagementText ;
    @CacheLookup
    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton ;
    @CacheLookup
    @FindBy(xpath="//h6[normalize-space()='Add User']")
    WebElement addUserText ;
    @CacheLookup
    @FindBy(xpath= "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    WebElement saveMessage ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
    WebElement recordSelectCheckbox ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]")
    WebElement recordFoundText;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]")
    WebElement usernameCheckbox;
    @CacheLookup////body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
    WebElement usernameInTheList ;
    @CacheLookup
    @FindBy(xpath= "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement yesDeleteButton ;
    @CacheLookup
    @FindBy(xpath= "//div[@class='oxd-toast-content oxd-toast-content--success']" )
            //div[@class='oxd-toast oxd-toast--success oxd-ctoast-container--toast']")
    WebElement deleteSuccessfullyText ;
    @CacheLookup
    @FindBy( xpath="//div[@class='oxd-toast oxd-toast--info oxd-toast-container--toast']")
    WebElement noRecordFoundText;
    public void clickOnAdminButton(){
        log.info("Click on Admin button"+admin.toString());
        clickOnElement(admin);
    }
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]" )
            //button[normalize-space()='Delete Selected'])[1]/button[normalize-space()='Delete Selected'])[1]")
    WebElement deleteSelectedButton ;
    public void clickDeleteSelectedButton(){
        log.info("Click Delete Selected button "+ deleteSelectedButton.toString());
        clickOnElement(deleteSelectedButton);
    }
    public void clickOnUserManagementOptionONTopMenu(){
        clickOnElement(userManagementOptionOnTopMenu);
    }
    /*
    This method will click on User option under User Management
    */
    public void selectUserOptionFromUserManagementDropdown(){
          mouseHoverToElementAndClick(userOptionInUserManagement);
    }
    public void clickOnAddButton(){// This method will click on Add button on Admin/ UserManagement page
        log.info("Click on Add button "+addButton.toString());
        clickOnElement(addButton);
    }
    public String getDeleteSuccessfullyText(){
        log.info("Get Delete succesfully Text "+deleteSuccessfullyText.toString());
        String text = getTextFromElement(deleteSuccessfullyText);
        System.out.println(text);
        return text;
    }

    public String getUsermanagementText(){
        log.info("Get User Management text"+userManagementText.toString());
        return getTextFromElement(userManagementText);
    }

    public String getAddUserText(){
        log.info("Get Add User text "+addUserText.toString());
        return getTextFromElement(addUserText);
    }
    public String verifySaveSuccessfully(){
        log.info("Verify Save successfully "+saveMessage.toString());
        return getTextFromElement(saveMessage);
    }
    public void clickCheckBoxtoSelectRecord(){
        log.info(" Click Check box to Select record"+recordSelectCheckbox.toString());
        clickOnElement(recordSelectCheckbox);
    }

    public String verifyRecodFound(){
        log.info("Verify record found "+recordFoundText.toString());
        String record = getTextFromElement(recordFoundText);
        System.out.println(record);
        return record;
    }
    public String getUsernameInSearchList(){
        log.info("Get user name in search list"+usernameInTheList.toString());
        return getTextFromElement(usernameInTheList);
    }
    public void clickOnUsernameCheckBox(){
        clickOnElement(usernameCheckbox);
    }
    public void clickOnyesDeleteButton(){
        log.info("Click on Yes Delete button "+yesDeleteButton.toString());
        clickOnElement(yesDeleteButton);

    }
    public String getNoRecordFoundText(){
        log.info("Get No Record Found Text "+noRecordFoundText.toString());
        String record = getTextFromElement(noRecordFoundText);
        System.out.println(record);
        return record;
    }
}
