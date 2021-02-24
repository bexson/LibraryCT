package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@id='menu_item']//li//a)[1]")
    public WebElement dashboardModule;

    @FindBy(xpath = "(//ul[@id='menu_item']//li//a)[2]")
    public WebElement usersModule;

    @FindBy(xpath = "(//ul[@id='menu_item']//li//a)[3]")
    public WebElement booksModule;



}
