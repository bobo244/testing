Feature: Login incorrect account
  Scenario Outline: Login with incorrect account
    Given user navigate to homepage "<url>"
    When user enter username "<username>" and password "<password>"
    Then a notice login fail appear
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | 1111111  | 1        |