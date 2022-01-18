package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.TestContext;

import utils.helpers.Helpers;
public class navigator_home_to_cart extends BaseStepDef {

    TestContext testContext;

    public navigator_home_to_cart(TestContext context){
        super(context);
        testContext = context;
    }

    @Given("user navigate to homepage {string} then login with username {string} and password {string}")
    public void userlogin(String url, String username, String password) {
        System.out.println("Driver on Steps class: " + driver);
        driver.get(url);
        driver.findElement(By.xpath("//a[@id='login2']")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        Helpers.delay(3);
    }

    @When("user click on cart")
    public void userClickOnCart() {
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
    }

    @Then("cart will appear")
    public void cartWillAppear() {
        String tieude = driver.findElement(By.xpath("//h2[normalize-space()='Products']")).getText();
        Assert.assertEquals(tieude,"Products","Lỗi nha");
    }
}
