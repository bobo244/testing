Feature: Sign up
  Scenario Outline: Sign up new account
    Given user navigate to homepage "<url>"
    And   click sign up button
    When user new enter username "<username>" and password "<password>"
    And   click button  signup
    Then a noitice sign up succesfull appear
    Examples:
      | url                                  | username   | password |
      | https://www.demoblaze.com/index.html | dongatest4 | 1        |
