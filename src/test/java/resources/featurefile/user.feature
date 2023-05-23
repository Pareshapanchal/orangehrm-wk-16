Feature: Users Tests
Background:
  Given I am on homepage
  When  I Enter username
  And   I Enter password
  And   I click on Login Button
  And   I click On "Admin" Tab
  Then  I verify "System Users" Text
@smoke@regression
  Scenario: adminShouldAddUserSuccessFully
   And  I click On "Add" button
   And  I verify "Add User" Text on Admin page
   And  I Select User Role "Admin"
   And  I enter Employee Name "a "
   And  I enter Username on Add User username field "Rosan"
   And  I select status "Disable"
   And  I enter pssaword in password field "RamSita@123"
   And  I enter Confirm Password "RamSita@123"
   And  I click On "Save" Button on Admin Page
   Then I verify message "Successfully Saved"


#@sanity@regression
Scenario: search The User Created And Verify It.
    And  I enter Username for Searching record "Rosan"
    And  I Select User Role for Searching record "Admin"
    And  I click on "Search"
    Then I verify the User should be in Result list "Rosan".

 #@smoke@regression
Scenario: Verify That Admin Should Delete The User SuccessFully.
    And  I enter Username for Searching record "Rosan"
    And  I Select User Role for Searching record "Admin"
    And  I click on "Search"
    Then I verify the User should be in Result list "Rosan".
    And  I click on check box  username
    And  I click on Delete Selected Button
    And  I click on Yes Delete Button on Popup dialogbox
    Then I verify message "Successfully Deleted" message

  @sanity
  Scenario: search The Deleted User And Verify The Message NoRecordFound
    And  I enter Username for Searching record "Rosan"
    And  I Select User Role for Searching record "Admin"
    And  I click on "Search"
    Then I verify message "No Records Found" on Admin page