package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @When("^I click On \"([^\"]*)\" Tab$")
    public void iClickOnTab(String arg0){
        new AdminPage().clickOnAdminButton();

    }
    @Then("^I verify \"([^\"]*)\" Text$")
    public void iVerifyText(String arg0)throws InterruptedException  {
        Thread.sleep(1000);
        Assert.assertEquals(new AdminPage().getUsermanagementText(),"User Management","UserManagement title not appeared");
    }

    @And("^I click On \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) {
        new AdminPage().clickOnAddButton();
    }
    @And("^I verify \"([^\"]*)\" Text on Admin page$")
    public void iVerifyTextOnAdminPage(String arg0) throws InterruptedException{
        Assert.assertEquals(new AdminPage().getAddUserText(),"Add User","Add User not displayed");
    }
    @And("^I Select User Role \"([^\"]*)\"$")
    public void iSelectUserRole(String arg0)throws InterruptedException {
       new AddUserPage().clickOnUserRoleDropdown();
        Thread.sleep(2000);
        new AddUserPage().selectAdmin();
    }

    @And("^I enter Employee Name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String employeeName) throws InterruptedException{
        Thread.sleep(2000);
        new AddUserPage().sendEmployeeName(employeeName);
        Thread.sleep(2000);
        new AddUserPage().clickOnEmployeeNameOption();
    }
    @And("^I enter Username on Add User username field \"([^\"]*)\"$")
    public void iEnterUsernameOnAddUserUsernameField(String username)  {
        new AddUserPage().sendUserName(username);
    }


    @And("^I select status \"([^\"]*)\"$")
    public void iSelectStatus(String status) throws InterruptedException{
        new AddUserPage().selectStatus();
        Thread.sleep(2000);
        new AddUserPage().selectDisableInStatusDropdown();
    }
    @And("^I enter pssaword in password field \"([^\"]*)\"$")
    public void iEnterPssawordInPasswordField(String password)  {
        new AddUserPage().sendPassword(password);
    }

    @And("^I enter Confirm Password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        new AddUserPage().sendConfirmPassword(confirmPassword);
    }

    @And("^I click On \"([^\"]*)\" Button on Admin Page$")
    public void iClickOnButtonOnAdminPage(String arg0) {
        new AddUserPage().clickOnSaveButton();
    }
    @Then("^I verify message \"([^\"]*)\"$")
    public void iVerifyMessage(String arg0) {
        String actualMessage = new AdminPage().verifySaveSuccessfully();
        String expectedMessage ="Success\nSuccessfully Saved";
        boolean message = actualMessage.contains(expectedMessage.trim());
        Assert.assertTrue(message);
    }
    @And("^I enter Username for Searching record \"([^\"]*)\"$")
    public void iEnterUsernameForSearchingRecord(String username)  {
        new ViewSystemUserPage().sendUserNameSystem(username);

    }

    @And("^I Select User Role for Searching record \"([^\"]*)\"$")
    public void iSelectUserRoleForSearchingRecord(String arg0)throws InterruptedException  {
        new ViewSystemUserPage().clickOnSelectRoleSystemDropdown();
        Thread.sleep(2000);
        new ViewSystemUserPage().clickOnAdminSystem();
        Thread.sleep(2000);
    }


    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0)throws InterruptedException {
        Thread.sleep(2000);
        new ViewSystemUserPage().clickOnSearchButton();
    }

    @Then("^I verify the User should be in Result list \"([^\"]*)\"\\.$")
    public void iVerifyTheUserShouldBeInResultList(String username) {
        System.out.println(username +  "   " +new AdminPage().getUsernameInSearchList());
        Assert.assertEquals(new AdminPage().getUsernameInSearchList(),username,"Record Not found");
    }
    @And("^I click on check box  username$")
    public void iClickOnCheckBoxUsername() {
        new AdminPage().clickOnUsernameCheckBox();
    }
    @And("^I click on Delete Selected Button$")
    public void iClickOnDeleteSelectedButton() {
        new AdminPage().clickDeleteSelectedButton();
    }
    @And("^I click on Yes Delete Button on Popup dialogbox$")
    public void iClickOnYesDeleteButtonOnPopupDialogbox() throws InterruptedException{
        new AdminPage().clickOnyesDeleteButton();
        Thread.sleep(1000);
    }

    @Then("^I verify message \"([^\"]*)\" message$")
    public void iVerifyMessageMessage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        String actualDeleteMessage = new AdminPage().getDeleteSuccessfullyText();
        String expectedDeletMessage="Success\nSuccessfully Deleted";
        boolean message = actualDeleteMessage.contains(expectedDeletMessage.trim());
        Assert.assertTrue(message);
    }
    @Then("^I verify message \"([^\"]*)\" on Admin page$")
    public void iVerifyMessageOnAdminPage(String arg0)  {

        String expectedNoRecordFoundMessage= "Info\nNo Records Found";
        String actualMessage = new AdminPage().getNoRecordFoundText();
        boolean message = actualMessage.contains(expectedNoRecordFoundMessage.trim());
       Assert.assertTrue(message);
    }


}
