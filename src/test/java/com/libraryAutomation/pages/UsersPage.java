package com.libraryAutomation.pages;

import com.github.javafaker.Faker;
import com.libraryAutomation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

public class UsersPage {



    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //WHEN YOU LOGGED IN AS LIBRARIAN , YOU SHOULD SEE THESE ELEMENTS ON USERS PAGE BELOW
    @FindBy(id = "user_status")
    public WebElement statusDropDownButton;

    @FindBy(name = "tbl_users_length")
    public WebElement recordsDropDown;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement usersModule;




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

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement addUserCloseButton;

    @FindBy(id = "add_user_modal")
    public WebElement addUserForm;

    @FindBy(xpath = "(//a[@role='button'])[2]" )
    public WebElement editUserButton;

    @FindBy(xpath = "//table/tbody//tr[1]/td[3]")
    public WebElement lastAddedUserName;

    @FindBy(xpath = "//table/tbody//tr[1]/td[4]")
    public WebElement lastAddedUserEmail;

    @FindBy(xpath = "//table/tbody//tr[1]/td[5]")
    public WebElement lastAddedUserGroup;





    public void addRandomName(){
        inputFullName.sendKeys(faker.name().fullName());
    }

    public void addPassword(){
        inputPassword.sendKeys(faker.animal().name());
    }

    public void addEmail(){
        inputEmail.sendKeys(faker.internet().emailAddress());
    }

    public void addStartDate(){

    }

    public void addEndDate(){

    }

    public void addAdress(){
        inputAdress.sendKeys(faker.address().fullAddress());
    }
    

    











    public void changeUserGroup(){
        Select groupDropDown = new Select(userGroupDropdown);
        if(groupDropDown.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase("3")){
            groupDropDown.selectByValue("2");
        }else{
            groupDropDown.selectByValue("3");
        }
    }


    public void changeUserStatus(){
        Select statusDropDown = new Select(statusDropdown);
        if(statusDropDown.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase("ACTIVE")){
            statusDropDown.selectByValue("INACTIVE");
        }else if(statusDropDown.getFirstSelectedOption().getAttribute("value").equalsIgnoreCase("INACTIVE")){
            statusDropDown.selectByValue("ACTIVE");
        }

    }




//    public String clickRandomUserEditButton(){
//        int low = 2;
//        int high = 12;
//        Random random = new Random();
//        int randUserIndex = random.nextInt(high-low) + low;
//        String xpath = "(//a[@role='button'])["+randUserIndex+"]";
//        return xpath;
//    }
//
    
}
