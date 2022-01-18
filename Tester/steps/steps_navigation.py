import...

from tests.acceptance.page_model.home_page import HomePage
from tests.acceptance.page_model.blog_page import BlogPage


use_step_matcher('re')



@given('I am on the homepage')
def step_impl(context):
	context.driver = webdriver.Chrome()
	page = HomePage(context.driver)
	context.driver.get(page.url)

@given('I am on the homepage')
def step_impl(context):
	context.driver = webdriver.Chrome()
	page = BlogPage(context.driver)
	context.driver.get(page.url)
	
@then('I am on the homepage')
def step_impl(context):
	expected_url = BlogPage(context.driver).url
	assert context.driver.current_url == expected_url
	

@then('I am on the homepage')
def step_impl(context):
	expected_url = HomePage(context.driver).url
	assert context.driver.current_url == expected_url