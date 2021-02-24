package com.libraryAutomation.step_definitions;
import com.libraryAutomation.pages.LandingPage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class CategoriesDropdown_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();

    @Given("Student is on the landing page")
    public void student_is_on_the_landing_page()throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
        loginPage.loginAsStudent();
        Thread.sleep(2000);
    }
    @When("Student clicks categories dropdown")
    public void studentClicksCategoriesDropdown() throws InterruptedException {
        landingPage.categoriesDD.click();
        Thread.sleep(2000);

    }

    @Then("Student should see all the list below")
    public void student_should_see_all_the_list_below(List<String> expectedList) {

    Select categoriesDD = new Select(landingPage.categoriesDD);
        List<String> actualList = BrowserUtils.getElementText(categoriesDD.getOptions());
        System.out.println(expectedList + " expected");
        System.out.println(actualList + " actual");
        Assert.assertEquals(actualList, expectedList);

    }

        }


