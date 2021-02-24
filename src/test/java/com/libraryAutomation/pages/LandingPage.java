package com.libraryAutomation.pages;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(id = "book_categories")
    public WebElement categoriesDD;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//h3[text()='Book Management']")
    public WebElement bookManagement;

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement studentButton;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement testStudentOrLibrarian;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logOutButton;
}
