Feature: login with no data

  Scenario Outline:  user login with no data user and password
    Given user navigate to "<url>"
    When user click button login and click login
    Then a notice login fail appear
    Examples:
      | url                                  |
      | https://www.demoblaze.com/index.html |