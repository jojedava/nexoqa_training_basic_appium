Feature: Android Appium Examples

  @Android
  Scenario: Show text after tap button
    Given the user closes the popup message
    And the user is on Home Screen
    When Display text button tapped
    Then text "Text is sometimes displayed" is shown
