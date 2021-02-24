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


    @Given("Student is on the landing page")
    public void student_is_on_the_landing_page() {
    }
    @When("Student clicks categories dropdown")
    public void studentClicksCategoriesDropdown() {

    }

    @Then("Student should see all the list below")
    public void student_should_see_all_the_list_below(List<String> expectedList) {
    LandingPage landingPage = new LandingPage();
    Select categoriesDD = new Select(landingPage.categoriesDD);
        List<String> actualList = BrowserUtils.getElementText(categoriesDD.getOptions());

        Assert.assertEquals(actualList, expectedList);

    }

        }


