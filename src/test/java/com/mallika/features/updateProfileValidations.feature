Feature: Update profile and Validate

  @UpdateProfile
  Scenario Outline: Verify user logged in
    Given the user is on sign in page
    When user provides "<email>" and "<pwd>" and clicks on Sign in button
    Then user gets logged in to Orders page
    When user clicks on account
    And updates the "<firstname>" by passing the current "<pwd>"
    Then verify the name is updated with "<firstname>"
    Examples:
      | email                   | pwd           |firstname|
      | ramanakakarla@gmail.com       | CodilityTest  |Dummy    |


