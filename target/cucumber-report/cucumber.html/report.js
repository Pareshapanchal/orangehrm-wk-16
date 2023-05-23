$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("user.feature");
formatter.feature({
  "line": 1,
  "name": "Users Tests",
  "description": "",
  "id": "users-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4207613800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I Enter username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I Enter password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click On \"Admin\" Tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify \"System Users\" Text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 50673500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterUsername()"
});
formatter.result({
  "duration": 237276401,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPassword()"
});
formatter.result({
  "duration": 96395000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 840819200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    }
  ],
  "location": "UserSteps.iClickOnTab(String)"
});
formatter.result({
  "duration": 1347408601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "System Users",
      "offset": 10
    }
  ],
  "location": "UserSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 1043840500,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "search The Deleted User And Verify The Message NoRecordFound",
  "description": "",
  "id": "users-tests;search-the-deleted-user-and-verify-the-message-norecordfound",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "I enter Username for Searching record \"Rosan\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I Select User Role for Searching record \"Admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click on \"Search\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify message \"No Records Found\" on Admin page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Rosan",
      "offset": 39
    }
  ],
  "location": "UserSteps.iEnterUsernameForSearchingRecord(String)"
});
formatter.result({
  "duration": 58894400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 41
    }
  ],
  "location": "UserSteps.iSelectUserRoleForSearchingRecord(String)"
});
formatter.result({
  "duration": 4201528400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 12
    }
  ],
  "location": "UserSteps.iClickOn(String)"
});
formatter.result({
  "duration": 2072947900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No Records Found",
      "offset": 18
    }
  ],
  "location": "UserSteps.iVerifyMessageOnAdminPage(String)"
});
formatter.result({
  "duration": 781688400,
  "status": "passed"
});
formatter.after({
  "duration": 138300,
  "status": "passed"
});
});