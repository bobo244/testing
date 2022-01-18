Feature: From homepage navigate to contact
  Scenario Outline: user can go to contact page when login complete
    Given user login at "<url>" with "<username>" and "<password>"
    When  user click on Contact
    Then Contact window appear
    Examples:
      | url                                  | username | password |
      | https://www.demoblaze.com/index.html | 1        | 1        |