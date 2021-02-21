package com.libraryAutomation.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{
    Faker faker = new Faker();


    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUserButton;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(name = "full_name")
    public WebElement inputFullName;

    @FindBy(name = "email")
    public WebElement inputEmail;

    @FindBy(name = "user_group_id")
    public WebElement userGroupDropdown;

    @FindBy(name = "status")
    public WebElement statusDropdown;

    @FindBy(name = "start_date")
    public WebElement inputStartDate;

    @FindBy(name = "end_date")
    public WebElement inputEndDate;

    @FindBy(id = "address")
    public WebElement inputAdress;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//table/tbody//tr[1]/td[3]")
    public WebElement lastAddedUserName;

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement addUserCloseButton;

    @FindBy(id = "add_user_modal")
    public WebElement addUserForm;


    public void addRandomName(){
        inputFullName.sendKeys(faker.name().fullName());
    }

    public void addPassword(){
        inputPassword.sendKeys(faker.animal().name());
    }

    public void addEmail(){
        inputEmail.sendKeys(faker.internet().emailAddress());
    }



}
