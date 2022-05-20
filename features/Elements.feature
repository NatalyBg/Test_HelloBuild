Feature: Text box Validation

  Scenario: Successful submit of information
    Given User is on elements page
    When User Navigate to Elements menu options
    And User clicks in Text Box
    And User enters  as Full Name testUser_1 and as email  Test@123.com and as Current Address 1st street
    And User enters as Permanent Address 2nd street
    And User clicks on submit button
    Then displayed is the information provided in the fields

Feature: Text box Validation

  Scenario: Successful submit of information
    Given User is on elements page
    When User Navigate to Elements menu options
    And User clicks in Text Box
    And User enters  as Full Name testUser_1 and as email  Test123.com and as Current Address 1st street
    And User enters as Permanent Address 2nd street
    And User clicks on submit button
    Then displayed in the Email field is an alert saying the email format should have an @ in it
Feature: Text box Validation

  Scenario: radio button check
    Given User is on elements page
    When User Navigate to Elements menu options
    And User clicks in Radio Button
    And User clicks on yesRadio
    Then displayed  You have selected Yes
