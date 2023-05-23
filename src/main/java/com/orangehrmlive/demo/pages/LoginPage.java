package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
1.LoginPage - Store usename, password, Login Button and LOGIN Panel text Locators
and create appropriate methods for it.
 */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(name="username")
    WebElement userName ;
    @CacheLookup
    @FindBy(name="password")
    WebElement password ;
    @CacheLookup
    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton ;
    @CacheLookup
    @FindBy(xpath="//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']" )
    WebElement hrForAlllogo ;
    @CacheLookup
    @FindBy(xpath="//h5[normalize-space()='Login']")
    WebElement loginPanelText ;
   //it should not be here
    @CacheLookup
    @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
    WebElement  profileLogo ;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    public void sendUserNameInUserNameField(String username){
        log.info("Enter user name  "+ username.toString());
        sendTextToElement(userName,username);}
    public void sendPasswordInPasswordField(String password1){
        log.info("Enter password "+password.toString());
        sendTextToElement(password,password1);
    }
    public void clickONLoginButton(){
        log.info("Click on Login button "+loginButton.toString());
        clickOnElement(loginButton);}
    public boolean getHRforAllogoText(){
        log.info("Get HR For All Logo text "+hrForAlllogo.toString());
        return isElementVisible(hrForAlllogo);

        }

    //public String getDashboardText(){return getTextFromElement(dashboard);}
    public void clickOnprofileLogo(){
        log.info("Click on Profile logo "+ profileLogo.toString());
        clickOnElement(profileLogo);}
    public void mouseHoverOnAndClickOnLogout(){
        log.info(" Mouse hover on and click on Logout"+logout.toString());
        mouseHoverToElementAndClick(logout);

    }
    public boolean getLoginPanelDisplayed(){
        log.info(" Get Login Panel Displayed text"+loginPanelText.toString());
        return isElementVisible(loginPanelText);

    }

}
