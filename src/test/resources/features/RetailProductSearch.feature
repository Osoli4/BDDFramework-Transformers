Feature: This feature is use for testing UI of Retail page

  @test
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  Scenario: Verify user can login to Retail Application
    Given User is on retail website
