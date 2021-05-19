Feature: Place and Validate Order

  @Login
  Scenario Outline: Verify user logged in
    Given the user is on sign in page
    When user provides "<email>" and "<pwd>" and clicks on Sign in button
    Then user gets logged in to Orders page
    When user clicks on t-shirts
    And Adds item to cart
    Then verify order placed in order History
    Examples:
      | email                   | pwd           |
      | ramanakakarla@gmail.com | CodilityTest  |


