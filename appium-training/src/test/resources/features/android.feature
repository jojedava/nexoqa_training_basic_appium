Feature: Android Appium Examples

  @Android
  Scenario: Show text after tap button
    Given the user closes the popup message
    And the user is on Home Screen
    When Display text button tapped
    Then text "Text is sometimes displayed" is shown

  Scenario: Show toast message after tap button
    Given the user is on Home Screen
    When Display a toast button tapped
    Then the toast message "Hello selendroid toast!" is shown

  @Android
  Scenario Outline: Register new user
    Given the user is on Home Screen
    And the user taps on registration button
    And the register page is shown
    When the user adds the Username "<Username>"
    And the user adds the Email "<Email>"
    And the user adds the Password "<Password>"
    And the user adds the Name "<Name>"
    And the user adds the programming Language "<ProgrammingLanguage>"
    And the user selects the checkbox
    And the user taps on Register button
    Then the verification page is shown

    Examples:
      | Username  | Email               | Password   | Name       | ProgrammingLanguage |
      | Username  | username@email.com  |   12345678 | Name       | Scala               |
      | Username2 | user2name@email.com | 1234567915 | Other Name | PHP                 |
