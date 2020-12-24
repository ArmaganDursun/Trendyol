package trendyol.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import trendyol.utilities.ConfigurationReader;
import trendyol.utilities.MyDriver;

import java.sql.Driver;

public class LoginStepDefinitions {
    @Given("user opens the login page")
    public void use_opens_the_login_page() {
      String url = ConfigurationReader.get("url");
        MyDriver.getdriver().get(url);
    }

    @When("he enters the credentials")
    public void he_enters_the_credentials() {

    }

    @Then("able to login")
    public void able_to_login() {

    }

}
