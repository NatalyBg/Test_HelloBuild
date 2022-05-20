Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on LogIn Page
    When User Navigate to LogIn Page
    And User enters as User Name testUser_1 and as password  Test@123.
    Then displayed profile page

Feature: Login Action

  Scenario: failed Login with invalid values
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters as User name ""  and  as password "Test@123"
    Then Message Alert displayed in the UserName field shows that the field needs to have a value

Feature: Login Action

  Scenario: failed Login with empty values
    Given User is on LogIn Page
    When User Navigate to LogIn Page
    And User enters as User name "" and as password "".
    Then Message Alert displayed  in the UserName and password field shows that the field needs to have a value

Feature: Login Action

  Scenario: Successful Login with invalid Credentials
    Given User is on LogIn Page
    When User Navigate to LogIn Page
    And User enters as User Name user and as password 33333.
    Then message alert displayed  shows Invalid username or password



Feature: New user Action

  Scenario: Successful Register with Valid Values
    Given User is on logIn page
    When User Navigate to LogIn Page
    And User clicks in New user button
    And User enters as First Name as "testuser_2" and Last name as "testuser_2"
    And User enters UserName as "testuser_2" and Password as "Test@123.*"
    And User checks CAPTCHA box
    Then Message displayed Registration Successfully


Feature: New user Action

  Scenario: Failed Register new user with invalid password value
    Given User is on logIn page
    When User Navigate to LogIn Page
    And User clicks in New user button
    And User enters as First Name as "testuser_2" and Last name as "testuser_2"
    And User enters UserName as "testuser_2" and Password as "Test"
    And User checks CAPTCHA box
    Then Message displayed "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer"

Feature: New user Action

  Scenario: Failed Register new user with unchecked reCAPTCHA
    Given User is on logIn page
    When User Navigate to LogIn Page
    And User clicks in New user button
    And User enters as First Name as "testuser_2" and Last name as "testuser_2"
    And User enters UserName as "testuser_2" and Password as "Test@123.*"
    Then Message displayed "Please verify reCaptcha to register!"

Feature: New user Action

  Scenario: Failed Register new User with empty  Values
    Given User is on logIn page
    When User Navigate to LogIn Page
    And User clicks in New user button
    And User enters First Name as "" and Last name as ""
    And user enters UserName as "" and Password as ""
    And User checks CAPTCHA box
    Then Message Alert displayed on First Name, Las Name, User Name, and Password field show that the field needs to have a value
