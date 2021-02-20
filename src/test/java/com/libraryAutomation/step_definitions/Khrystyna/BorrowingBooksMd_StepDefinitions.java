package com.libraryAutomation.step_definitions.Khrystyna;

import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BorrowingBooksMd_StepDefinitions {

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        String expectedUrl = ConfigurationReader.getProperty("homePage_Url");
        String currentUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(expectedUrl.equals(currentUrl));
    }


    @When("User click Borrowing Books module")
    public void user_click_borrowing_books_module() {

    }
    @Then("User should see the following column names:")
    public void user_should_see_the_following_column_names() {

    }

}
