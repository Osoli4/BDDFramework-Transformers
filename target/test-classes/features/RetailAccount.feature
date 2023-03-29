Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Tek.Student@gmail.com' and password 'Sdet@1234'
    And User click on login button
    Then User should be logged in into Account

  @UpdatingProfileTest
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'RedRoad' and Phone '7573005000'
    And User click on Update button
    Then User profile information should be updated

  @AddingPaymentMethod
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @EditingDebitOrCreditCardTest
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemovingPaymentCardTest
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @addingAddressTest
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @EditingPreviousAddressTest
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'
