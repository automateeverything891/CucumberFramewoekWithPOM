Feature: Login Features

Scenario: Valid login
Given navigate to Login page
When user is in login page
Then user logins using valid credentials
And home page should be displayed

