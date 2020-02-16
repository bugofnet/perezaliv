Feature: I want to test task six

  Scenario: I want to login with correct credentials
    Given I go to main page
    When I select "6" task
    And I login as "tester" with password "123-xyz"
    Then I should see the link to download file

  Scenario Outline: I want to login with wrong credentials
    Given I go to main page
    When I select "6" task
    And I login as "<login>" with password "<password>"
    Then I should not see the link to download file

    Examples:
      | login    | password |
      | bugofnet |          |
      |          | 123456   |
