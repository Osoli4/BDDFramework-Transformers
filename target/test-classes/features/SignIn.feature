Feature: TEK Retail Application SignIn feature

	@SigningInTest
  Scenario: Verify user can sign into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Tek.Student@gmail.com' and password 'Sdet@1234'
    And User click on login button
    Then User should be logged in into Account

  @AccountCreatingTest
  Scenario: Verify user can create account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email | password  | confirmPassword |
      | fullName | email | Sdet@1234 | Sdet@1234       |
    And User click on SignUp button
    Then User should be logged into account page
