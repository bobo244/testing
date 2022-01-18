Feature: Test that pages have correct content

	Scenario: Blog page has a correct title
	Given I am on the blog page
	When There is a title shown on the page
	Then The title tag has content "This í the blog page"

	Scenario: Blog page has a correct title
	Given I am on the homepage
	When There is a title shown on the page
	Then The title tag has content "This í the homepage"