Feature: Navigate to Menu Parameters

Background:
  Given The user is on the login page

  Scenario: User navigates to Developers Menu

    When The user logs in using "umut@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see  header as "Filter Profiles by Skill or by Location"

    Scenario: User navigates to All Posts Menu

      When The user logs in using "umut@gmail.com" and "Test12345!"
      Then The welcome message contains "umut"
      And The user navigates to "All Posts" menu
      Then The user should be able to see  header as "Posts"

    Scenario: User navigates to My Account Menu

      When The user logs in using "berlin@gmail.com" and "berlin"
      Then The welcome message contains "Babamyrat"
      And The user navigates to "My Account" menu
      Then The user should be able to see  header as "Dashboard"








