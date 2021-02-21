package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.BasePage;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RecordsDropdown_StepDefinitions {
    BasePage basePage = new BasePage();
    UsersPage usersPage = new UsersPage();
    Select recordsDropdown = new Select(usersPage.recordsDropDown);

    @Given("Librarian is on the landing page")
    public void librarian_is_on_the_landing_page() { //I already did it in Hooks class
    }

    @When("Librarian is on the Users page")
    public void librarian_is_on_the_users_page() {
        basePage.usersModule.click();
    }

    @Then("User should see {string} by default in the records dropdown")
    public void user_should_see_by_default_in_the_records_dropdown(String expected) {
        String actual = recordsDropdown.getFirstSelectedOption().getText();
        Assert.assertTrue(expected.equalsIgnoreCase(actual));
    }

    @When("Librarian clicks to dropdown")
    public void librarian_clicks_to_dropdown() {
    }

    @Then("Librarian should see options below")
    public void librarian_should_see_options_below(List<String> options) {
        List<WebElement> allOptionsAsWebEls = recordsDropdown.getOptions();
        List<String> optionsAsString = BrowserUtils.getElementText(allOptionsAsWebEls);

        Assert.assertTrue(optionsAsString.equals(options));
    }




}
