
Feature: Login Test
 #@sanity @regression
  Scenario: verify User Should Login SuccessFully
    Given I am on homepage
    When  I Enter username
    And   I Enter password
    Then  I click on Login Button
    Then  I verify "Dashboard" Message on next page
  #@sanity@regression
  Scenario: verify That The Logo Display On HomePage
    Given I am on homepage
    Then  I Verify Logo is Displayed
  #@smoke@regression
  Scenario: verifyUserShouldLogOutSuccessFully
    Given I am on homepage
    When  I Enter username
    And   I Enter password
    Then  I click on Login Button
    And   I click on User Profile logo
    And   I mouse hover on "Logout" and click
    Then  I verify the text "Login Panel" is displayed