
Feature: Log in as different user


  Scenario: Log in as teacher with parameters
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    Then The welcome message contains "Teacher"

    Scenario: Log in as student with parameters
      Given The user is on the login page
      When The user logs in using "umut@gmail.com" and "Test12345!"
      Then The user should be able to login
      Then The welcome message contains "umut"





