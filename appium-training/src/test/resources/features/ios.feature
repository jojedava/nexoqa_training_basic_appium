Feature: iOS Appium Example

  Scenario: Compute Sum
    Given the user adds the first number 4
    And the user adds the second number 4
    When the user clicks on the button
    Then the app show the operation result 8

  Scenario Outline: Compute Sum with examples
    Given the user adds the first number <number1>
    And the user adds the second number <number2>
    When the user clicks on the button
    Then the app show the operation result <result> and expected "<pass>"

    Examples:
      | number1 | number2 | result | pass  |
      |       2 |       3 |      5 | true  |
      |      10 |       5 |     15 | true  |
      |      10 |       5 |     12 | false |

  Scenario: Open and close alert message
    Given the alert message is open
    When the ok button is clicked
    Then the alert message is closed

  @debug
  Scenario: Move the slider and check value
    Given the slider element is present
    When the slider has moved to 90
    Then value should be 90 exceeded or less than 5
