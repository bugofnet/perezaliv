Feature: I want to test task six

  Scenario: I want to login with correct credentials
    Given I go to main page
    When I login as "bugofnet" with password "1234Abcd@"
    Then I have been successfully logged

  Scenario Outline: I want to login with wrong credentials
    Given I go to main page
    And I login as "<login>" with password "<password>"
    Then I have not been successfully logged

    Examples:
      | login    | password |
      | tester   | 123      |
      | bugofnet | 123-xy  |