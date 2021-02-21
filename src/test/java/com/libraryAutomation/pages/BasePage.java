package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='navbarCollapse']//li[2]//a")
    public WebElement BorrowingBooksModule;


//    When we logged in as librarian , then we have these web elements below

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement dashboardModule;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement usersModule;

    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement booksModule;



}
