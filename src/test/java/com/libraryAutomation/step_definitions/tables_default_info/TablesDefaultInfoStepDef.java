package com.libraryAutomation.step_definitions.tables_default_info;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TablesDefaultInfoStepDef {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Given("the user on the homepage")
    public void the_user_on_the_homepage() {

        String username = ConfigurationReader.getProperty("student94email");
        String password = ConfigurationReader.getProperty("studen94password");
        driver.get(ConfigurationReader.getProperty("logIn_Url"));
        loginPage.login(username, password);
        wait.until(ExpectedConditions.urlContains("books"));

    }


    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedValue) {


    }


}
