Feature: Basic Feature

  Scenario: eat 5 out of 12
    Given there are 12 cucumbers
    When I eat 5 cucumbers
    Then I should have 7 cucumbers

  Scenario: eat 5 out of 20
    Given there are 20 cucumbers
    When I eat 5 cucumbers
    Then I should have 15 cucumbers

  Scenario Outline: eat <eat> out of <of>
    Given there are <of> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers
    Examples:
      | of | eat | left |
      | 12 | 5   | 7    |
      | 20 | 5   | 15   |
