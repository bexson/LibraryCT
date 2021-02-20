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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BorrowingBooksMd_StepDefinitions {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    BorrowingBooksPage borrowingBooksPage = new BorrowingBooksPage();

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
        //creating empty List<String> to store located WebTable info
        List<String> actualWebElementsList = new ArrayList<>();

        //locating 1st row of WebTable and storing it in List<WebElement>
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//table[@id='borrowed_list']//th"));
        for(WebElement eachElement : rows){
            actualWebElementsList.addAll(Arrays.asList(eachElement.getText()));
        }


    }


}
