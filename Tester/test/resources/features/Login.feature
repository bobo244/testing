Feature: Login Page

  Scenario Outline: Login page to Product Store
    Given user navigate to url "<url>"
    When user enter username "<username>" and password "<password>"
    And click login button
    Then The user redirect to homepage
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | 1        | 1        |