@login
Feature: Eurotech Log in Test

  @Teacher
  Scenario: Login as a teacher
    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to login

  @Student
  Scenario: Login as a student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  @db
  Scenario: Login as developer
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

  @sdet @db
  Scenario: Login as SDET
    Given The user is on the login page
    When The user enters SDET credentials
    Then The user should be able to login


