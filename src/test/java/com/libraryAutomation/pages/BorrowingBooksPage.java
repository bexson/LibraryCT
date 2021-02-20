package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BorrowingBooksPage {

    public BorrowingBooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
