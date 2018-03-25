Feature: Login functionality
  Scenario Outline: Verify Login functionality is working as expected.
    Given user is on login page
    And he enters <user name>
    And he enters <password>
    And he enters
    Examples:
      |user name|password|
    |dbbhatt  |swara   |
    |dbbhattt |swara   |
    |dbbhatt  |swwaraaa|
    |dbbhatt  |swaara  |