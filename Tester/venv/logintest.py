from selenium import webdriver
import time
from pyunitreport import HTMLTestRunner
import unittest


class LoginTester(unittest.TestCase):

    @classmethod
    def setUpClass(cls):
        cls.driver = webdriver.Chrome(
            executable_path="/home/christine/PycharmProjects/Selenium_testing/venv/bin/chromedriver")
        cls.driver.implicitly_wait(5)
        cls.driver.maximize_window()

    def test_login_logout(self):
        self.driver.get("https://opensource-demo.orangehrmlive.com/")
        self.driver.find_element_by_name("txtUsername").send_keys("Admin")
        self.driver.find_element_by_name("txtPassword").send_keys("admin123")
        self.driver.find_element_by_id("btnLogin").click()
        self.driver.refresh()
        self.driver.find_element_by_id("welcome").click()
        self.driver.find_element_by_link_text("Logout").click()

    @classmethod
    def tearDownClass(cls):
        cls.driver.close()
        cls.driver.quit()
        print("Test Completed")


if __name__ == "__main__":
    unittest.main(testRunner=HTMLTestRunner(output="reports"))