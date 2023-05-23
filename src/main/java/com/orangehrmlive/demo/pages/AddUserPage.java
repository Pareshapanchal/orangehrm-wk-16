package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
* 6.AddUserPage - User Role Drop Down, Employee Name, Username, Status Drop Down,
Password, Confirm Password, Save and Cancle Button Locators and it's actions
* */

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]" )
WebElement  userRoleSelect;
@CacheLookup
@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
WebElement  cancelButton;
@CacheLookup
@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/span[1]" )
WebElement adminUserRole;
@CacheLookup////body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]
@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
WebElement employeeNameField;
@CacheLookup
@FindBy( xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")
        //body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]" )
        //body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")
        //body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]")

WebElement employeeDropdown;
@CacheLookup
@FindBy(xpath= "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
WebElement userName;
@CacheLookup
@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
WebElement selectStatus;
@CacheLookup
@FindBy(xpath= "//span[normalize-space()='Disabled']")
WebElement disableStatus ;
@CacheLookup
@FindBy(xpath= "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
WebElement password ;
@CacheLookup
@FindBy(xpath= "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
WebElement confirmPassword ;
@CacheLookup
@FindBy(xpath= "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
WebElement saveButton ;

    public void clickOnCancelButton(){
         log.info("Click on cancel button"+cancelButton.toString());
         clickOnElement(cancelButton);
    }
    public void clickOnUserRoleDropdown(){
        log.info("Click on User Role"+userRoleSelect.toString());
        clickOnElement(userRoleSelect);
    }
    public void selectAdmin(){
        log.info("Admin Page User role"+adminUserRole.toString());
        clickOnElement(adminUserRole);
    }
    public void sendEmployeeName(String empName){
        log.info("Enter Employee Name "+employeeNameField.toString());
        sendTextToElement(employeeNameField,empName);
    }
    public void clickOnEmployeeNameOption(){
        log.info("Employee Name dropdown list"+ employeeDropdown.toString());
       mouseHoverToElementAndClick(employeeDropdown);
    }
    public void sendUserName(String username){
        log.info("Enter User Name"+userName.toString());
        sendTextToElement(userName,username);
    }
    public void selectStatus(){
        log.info("Select status"+selectStatus.toString());
        clickOnElement(selectStatus);

    }
    public void selectDisableInStatusDropdown(){
        log.info("Select disble in status"+disableStatus.toString());
        clickOnElement(disableStatus);
    }
    public void sendPassword(String password1){
        log.info("Enter Password"+password.toString());
        sendTextToElement(password,password1);
    }
    public void sendConfirmPassword(String confimpassword1){
        log.info("Enter confim password"+confirmPassword.toString());
        sendTextToElement(confirmPassword,confimpassword1);
    }
    public void clickOnSaveButton(){
        log.info("Click on save button"+saveButton.toString());
        clickOnElement(saveButton);}

}
