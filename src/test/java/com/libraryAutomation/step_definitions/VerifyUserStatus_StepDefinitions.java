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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VerifyUserStatus_StepDefinitions {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    @Given("the user \\(Librarian) on the homepage")
    public void the_user_librarian_on_the_homepage()  {

        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
        loginPage.loginAsLibrarian();
        BrowserUtils.sleep(2);

    }

    @When("the user clicks users module link")
    public void theUserClicksUsersModuleLink()  {

        basePage.usersLink.click();
        BrowserUtils.sleep(2);

    }

    @When("the user click Status dropdown")
    public void the_user_click_status_dropdown()  {

        usersPage.statusDropDownButton.click();
        BrowserUtils.sleep(2);

    }

    @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expectedList) {

        Select options = new Select(usersPage.statusDropDownButton);
        List<String> actualList = BrowserUtils.getElementText(options.getOptions());

        System.out.println(expectedList + " expected");
        System.out.println(actualList + " actual");

        Assert.assertEquals(actualList,expectedList);


    }


}
