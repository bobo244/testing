from behave import *

from test.acceptance.page_model.base_page import BasePage

use_step_matcher('re')

@when('I click on the "(.*)" link')
def step_impl(context, link_text):
	page = BasePage(context.driver)
	link = page.navigation

	matching_link = [l for l in links if l.text == link_text]


	if len(matching_link) > 0:
		matching_link[0].click()
	else:
		raise RuntimeError()
