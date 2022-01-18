Feature: Check image in the box on title
  Scenario Outline: the image title alway appear
    Given user navigate to "<url>"
    When user click next icon
    Then the next image title appear

    Examples:

    |url|
    |   |

