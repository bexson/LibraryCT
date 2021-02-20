package com.libraryAutomation.step_definitions.Khrystyna;

import com.libraryAutomation.pages.BasePage;
import com.libraryAutomation.pages.BorrowingBooksPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BorrowingBooksMd_StepDefinitions {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() throws InterruptedException {
        //login
        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
        loginPage.loginAsStudent();
    }


    @When("User click Borrowing Books module")
    public void user_click_borrowing_books_module() {
        basePage.BorrowingBooksModule.click();
    }

    @Then("User should see the following column names:")
    public void user_should_see_the_following_column_names() {


    }


}
