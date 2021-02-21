package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailField;

    @FindBy(id = "inputPassword")
    public WebElement passwordField;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement loginButton;

    public void loginAsStudent(){
        emailField.sendKeys(ConfigurationReader.getProperty("userEmail_1"));
        passwordField.sendKeys(ConfigurationReader.getProperty("userPassword_1"));
        loginButton.click();
    }

    public void loginAsLibrarian(){
        emailField.sendKeys(ConfigurationReader.getProperty("userEmail_4"));
        passwordField.sendKeys(ConfigurationReader.getProperty("userPassword_4"));
        loginButton.click();
    }


}
