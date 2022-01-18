package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;

public class signup  extends  BaseStepDef{
    TestContext testContext;

    public signup(TestContext context){
        super(context);
        testContext = context;
    }
    @Given("user navigate to homepage {string}")
    public void userNavigateToHomepage(String url) {
        System.out.println("Drive on Steps class" + driver);
        driver.get(url);
    }
    @And("click sign up button")
    public void clickSignUpButton() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[@id='signin2']")).click();
    }

    @When("user new enter username {string} and password {string}")
    public void userNewEnterUsernameAndPassword(String username, String password) {
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
    }
    @And("click button  signup")
    public void clickButtonSignup() {
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
    }

    @Then("a noitice sign up succesfull appear")
    public void aNoiticeSignUpSuccesfullAppear() {
        String thongbao = driver.switchTo().alert().getText();
        Assert.assertEquals(thongbao,"Sign up successful.");
    }


}
