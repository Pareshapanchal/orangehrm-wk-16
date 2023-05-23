package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Enter username$")
    public void iEnterUsername() {
        new LoginPage().sendUserNameInUserNameField("Admin");

    }

    @And("^I Enter password$")
    public void iEnterPassword() {
        new LoginPage().sendPasswordInPasswordField("admin123");
    }

    @Then("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickONLoginButton();
    }
    @Then("^I verify \"([^\"]*)\" Message on next page$")
    public void iVerifyMessageOnNextPage(String dashboard)  {
        Assert.assertEquals(new DashboardPage().getDashboardText(),"Dashboard","Dashboard title not appeared");
    }


    @Then("^I Verify Logo is Displayed$")
    public void iVerifyLogoIsDisplayed() {
        Assert.assertTrue(new LoginPage().getHRforAllogoText(),"Logo Not Displayed");
    }

    @And("^I click on User Profile logo$")
    public void iClickOnUserProfileLogo() {
        new LoginPage().clickOnprofileLogo();
    }

    @And("^I mouse hover on \"([^\"]*)\" and click$")
    public void iMouseHoverOnAndClick(String arg0)throws InterruptedException{
       new LoginPage().clickOnprofileLogo();
        Thread.sleep(2000);
        new LoginPage().mouseHoverOnAndClickOnLogout();

    }

    @Then("^I verify the text \"([^\"]*)\" is displayed$")
    public void iVerifyTheTextIsDisplayed(String arg0) {
        Assert.assertTrue(new LoginPage().getLoginPanelDisplayed(),"Login page not displayed");
    }


}
