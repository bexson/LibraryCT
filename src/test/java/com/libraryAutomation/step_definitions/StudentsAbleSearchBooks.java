package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.BasePage;
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
import java.util.List;

public class StudentsAbleSearchBooks {
    LoginPage loginPage = new LoginPage();
    String url = ConfigurationReader.getProperty("logIn_Url");

    @Given("Student is on the homepage")
    public void student_is_on_the_homepage() throws InterruptedException {

        Driver.getDriver().get(url);
        loginPage.loginAsStudent();
        Thread.sleep(3000);
    }
    @When("Student click on ALL window under Book Categories")
    public void studentClickAllCategories() {
        System.out.println("");
    }

    @Then("Student should see the list of book categories:")
    public void student_should_see_the_list_of_book_categories(List<String> expectedList) {

        List<String> actualList = new ArrayList<>();

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//*[@id=\"book_categories\"]"));
        for(WebElement eachElement : rows){
            actualList.add(eachElement.getText());
        }

        Assert.assertTrue(expectedList.equals(actualList));


    }
}