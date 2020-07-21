$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Features",
  "description": "",
  "id": "login-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid login",
  "description": "",
  "id": "login-features;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigate to Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is in login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user logins using valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "home page should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.navigate_to_Login_page()"
});
formatter.result({
  "duration": 16569744500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_login_page()"
});
formatter.result({
  "duration": 1029848700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_logins_using_valid_credentials()"
});
formatter.result({
  "duration": 520235800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.home_page_should_be_displayed()"
});
formatter.result({
  "duration": 63185700,
  "status": "passed"
});
formatter.uri("02_homePage.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM HomePage",
  "description": "",
  "id": "freecrm-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Home page",
  "description": "",
  "id": "freecrm-homepage;validate-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is in Home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user validates Home page Elements",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.navigate_to_Home_page()"
});
formatter.result({
  "duration": 1486079200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_is_in_Home_page()"
});
formatter.result({
  "duration": 175150400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_validates_Home_page_Elements()"
});
formatter.result({
  "duration": 200734700,
  "status": "passed"
});
formatter.uri("03_calendar.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Calendar Features",
  "description": "",
  "id": "freecrm-calendar-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Calendar page",
  "description": "",
  "id": "freecrm-calendar-features;validate-calendar-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is in Home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "navigate to Calendar page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate Calendar page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.navigate_to_Home_page()"
});
formatter.result({
  "duration": 62395800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_is_in_Home_page()"
});
formatter.result({
  "duration": 90966000,
  "status": "passed"
});
formatter.match({
  "location": "CalendarStepDefinition.navigate_to_Calendar_page()"
});
formatter.result({
  "duration": 188804300,
  "status": "passed"
});
formatter.match({
  "location": "CalendarStepDefinition.validate_Calendar_page()"
});
formatter.result({
  "duration": 109870300,
  "status": "passed"
});
formatter.uri("04_contacts.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Contacts Features",
  "description": "",
  "id": "freecrm-contacts-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Contacts page",
  "description": "",
  "id": "freecrm-contacts-features;validate-contacts-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is in Home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "navigate to Contacts page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate Contacts page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.navigate_to_Home_page()"
});
formatter.result({
  "duration": 193160500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_is_in_Home_page()"
});
formatter.result({
  "duration": 43313700,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.navigate_to_Contacts_page()"
});
formatter.result({
  "duration": 153526100,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefinition.validate_Contacts_page()"
});
formatter.result({
  "duration": 253245200,
  "status": "passed"
});
});