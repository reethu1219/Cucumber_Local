Feature: To Test the amazon Home page

  Background: Positive scenario to test login functionality
    Given User has opened amazon website on Chrome Browser
    When User enters incorrect username and password
    Then User should not be able to login successfully

  Scenario: To test all the products are displayed when we search laptop
    Given User is already on home page
    When User is trying to search laptops
    Then User should be displayed all the available laptops

  Scenario: To test all the products are displayed when we search laptop
    Given User is already on home page
    When User is trying to search laptops
    Then User should be displayed all the available laptops

  Scenario: To test all the products are displayed when we search laptop
    Given User is already on home page
    When User is trying to search laptops
    Then User should be displayed all the available laptops
