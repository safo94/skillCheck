@smoke_test
Feature: Sell or trade feature

  @sellOrTrade
  Scenario Outline: User is able to sell or trade
    Given I click on sell or trade
    When I input licence or plate "<plate>" and select state "<state>"

    Examples:
      | plate  | state      |
      | 6YR453 | Colorado   |
      | AZERI  | Alaska     |
      | YERAZ  | California |
