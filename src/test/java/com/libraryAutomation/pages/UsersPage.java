package com.libraryAutomation.pages;

import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //WHEN YOU LOGGED IN AS LIBRARIAN , YOU SHOULD SEE THESE ELEMENTS ON USERS PAGE BELOW
    @FindBy(id = "user_status")
    public WebElement statusDropDownButton;

    @FindBy(name = "tbl_users_length")
    public WebElement recordsDropDown;
}
