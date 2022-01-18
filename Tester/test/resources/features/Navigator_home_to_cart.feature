Feature: From home to cart of user
  Scenario Outline: Navigator from homepage to cart
    Given  user navigate to homepage "<url>" then login with username "<username>" and password "<password>"
    When    user click on cart
    Then   cart will appear
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | 1        | 1        |
