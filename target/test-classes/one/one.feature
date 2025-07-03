@logo
Feature: Login Feature

Scenario: Login with credentials
  Given Application is open
  When I login with user "<user>" and pass "<pass>"
  Then the Application should open
  
  Examples:
    | user | pass  |
    | Admin    | admin123  |
    | user1    | pass1     |
    | user2    | pass2     |