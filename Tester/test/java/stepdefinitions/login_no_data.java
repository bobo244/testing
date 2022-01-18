package stepdefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.helpers.Helpers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class login_no_data extends  BaseStepDef {

        TestContext testContext;

    public login_no_data(TestContext context){
            super(context);
            testContext = context;
        }

    @Given("user navigate to {string}")
    public void userNavigateTo(String url) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        Helpers.delay(1);
    }

    @When("user click button login and click login")
    public void userclickbuttonlogin() {
        Helpers.delay(1);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
    }
    

    @Then("a notice login fail appear")
    public void aNoticeLoginFailAppear() {
        Helpers.delay(3);
        String thongbao =  driver.switchTo().alert().getText();
        Assert.assertEquals(thongbao,"Please fill out Username and Password.","Login Succesful");
    }
}

