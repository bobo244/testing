package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;
public class signup_with_alreadyaccount extends  BaseStepDef{
    TestContext testContext;

    public signup_with_alreadyaccount(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("user navigato to {string} and click on sign up button")
    public void userNavigatoToAndClickOnSignUpButton(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
    }

    @When("enter exist username {string} and password {string}")
    public void enterExistUsernameAndPassword(String username, String password) {
        Helpers.delay(1);
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
    }

    @Then("sign up fail")
    public void signUpFail() {
        Helpers.delay(2);
        String note = driver.switchTo().alert().getText();
        Assert.assertEquals(note,"This user already exist.");
    }
}
