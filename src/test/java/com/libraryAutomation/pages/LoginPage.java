package com.libraryAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//label[.='Email address']")
    public WebElement emailField;

    @FindBy(xpath = "//label[.='Password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement loginButton;


}
