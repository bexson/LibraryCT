package com.libraryAutomation.step_definitions.Khrystyna;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import org.junit.Before;

public class Hooks {

    LoginPage loginPage = new LoginPage();

    //setUp scenario is logIn
    @Before
    public void setUpScenario(){
        String url = ConfigurationReader.getProperty("logIn_Url");
        Driver.getDriver().get(url);

        //passing password/email in the email/password fields and pressing LOGIN BUTTON
        String email = ConfigurationReader.getProperty("userEmail_1");
        String password = ConfigurationReader.getProperty("userPassword_1");

        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();

    }

}
