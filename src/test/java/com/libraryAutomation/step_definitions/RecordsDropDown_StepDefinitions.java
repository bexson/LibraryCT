package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.BasePage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RecordsDropDown_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    String url = ConfigurationReader.getProperty("logIn_Url");

    BasePage basePage = new BasePage();
//    UsersPage usersPage = new UsersPage();// If I'm using the same locator I gotta reinitialize it again

    @Given("Librarian is on the landing page")
    public void librarian_is_on_the_landing_page() {
        Driver.getDriver().get(url);
        loginPage.loginAsLibrarian();
    }

    @When("Librarian is on the Users page")
    public void librarian_is_on_the_users_page() {
        basePage.usersModule.click();
    }
    @Then("User should see {string} by default in the records dropdown")
    public void user_should_see_by_default_in_the_records_dropdown(String expected) {
        UsersPage usersPage = new UsersPage();

        Select recordsDropdown = new Select(usersPage.recordsDropDown);

        String actual = recordsDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual , expected);

    }

    @When("Librarian clicks records dropdown")
    public void librarian_clicks_records_dropdown() {
    }


    @Then("User should see numbers below")
    public void user_should_see_numbers_below(List<String> expectedOptions) {
        UsersPage usersPage = new UsersPage();
        Select recordsDropDown = new Select(usersPage.recordsDropDown);

        List<String> actualOptions = BrowserUtils.getElementText(recordsDropDown.getOptions());

        Assert.assertEquals(actualOptions , expectedOptions);

    }


}
