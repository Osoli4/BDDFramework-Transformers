Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Tek.Student@gmail.com' and password 'Sdet@1234'
    And User click on login button
    Then User should be logged in into Account

  @smokeTest
  Scenario: Verify User can update Profile Information
    When user click on Account option
    And User update Name 'OsoliNew' and Phone '7572188400'
    And User click on Update button
    Then User profile information should be updated
