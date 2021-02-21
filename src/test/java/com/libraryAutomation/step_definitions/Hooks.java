package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.BasePage;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.BrowserUtils;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    String url = ConfigurationReader.getProperty("logIn_Url");

    //THIS BEFORE WITH VALUE @records is for USER STORY 5 ( RECORDS DROPDOWN FEATURE )
    @Before(value = "@records")
    public void loginAsLibrarian() {
        Driver.getDriver().get(url);
        loginPage.loginAsLibrarian();
    }

    @After(order = 2)
    public void tearDownScenario2(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(5);
        // Driver.closeDriver();
    }

}
