Feature: Eating Cucumbers

  Scenario: eat 5 out of 12
    Given there are 12 cucumbers
    When I eat 5 cucumbers
    Then I should have 7 cucumbers

  Scenario: eat 5 out of 20
    Given there are 20 cucumbers
    When I eat 5 cucumbers
    Then I should have 15 cucumbers
    And I should be full

  Scenario Outline: eat <eat> out of <of> to be <state>
    Given there are <of> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers
    And I should be <state>
    Examples:
      | of | eat | left | state  |
      | 12 | 5   | 7    | full   |
      | 20 | 5   | 15   | full   |
      | 10 | 1   | 9    | hungry |
