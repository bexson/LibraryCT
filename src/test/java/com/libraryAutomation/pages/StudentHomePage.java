package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StudentHomePage {

    public Iterable<? extends WebElement> tableHeaders;

    public StudentHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
