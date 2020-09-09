@smoke_test
Feature: This feature is to validate body types

  @bodyTypes
  Scenario Outline: Verify body types and number of cars for each body type
    Given I shop for new car
    Then I click on Body Type
    And I choose body type "<bodyTypes>"
    Then I should see <numOfcars> cars


    Examples:
      | bodyTypes | numOfcars |
      | Sedans    | 27        |
      | SUVs      | 32        |
      | Trucks    | 8         |