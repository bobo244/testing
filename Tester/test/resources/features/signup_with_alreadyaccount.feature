Feature: sign up with already exist account
  Scenario Outline: user can not sign up with already exist account
    Given user navigato to "<url>" and click on sign up button
    When enter exist username "<username>" and password "<password>"
    Then  sign up fail
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | 1        | 1        |