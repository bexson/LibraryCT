package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LibrarianAddUser_Step_Definitions {

    UsersPage usersPage = new UsersPage();


    @Given("Librarian is on user management page")
    public void librarian_is_on_user_management_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
        new LoginPage().loginAsLibrarian();
        new UsersPage().usersModule.click();
    }

    @When("Librarian clicks Add User button")
    public void librarianClicksAddUserButton() {
        usersPage.addUserButton.click();
    }


    @And("Librarian enters {string} in fullname")
    public void librarianEntersInFullname(String arg0) {
        usersPage.inputFullName.sendKeys(arg0);
    }

    @And("Librarian enters {string} in password box")
    public void librarian_enters_in_password_box(String string) {
        usersPage.inputPassword.sendKeys(string);
    }

    @And("Librarian enters {string} in email box")
    public void librarian_enters_in_email_box(String string) {
        usersPage.inputEmail.sendKeys(string);

    }

    @And("Librarian chooses {string} for usergroup option")
    public void librarianChoosesForUsergroupOption(String arg0) {
        Select userGroupSelection = new Select(usersPage.userGroupDropdown);
        System.out.println(arg0);
        if(arg0.equalsIgnoreCase("Librarian")){
            userGroupSelection.selectByValue("2");
        }else if(arg0.equalsIgnoreCase("Students")){
            userGroupSelection.selectByValue("3");
        }else{
            Assert.fail("Input must be Librarian or Students");
        }
    }

    @And("Librarian chooses {string} for status option")
    public void librarian_chooses_for_status_option(String string) {
        Select statusSelection = new Select(usersPage.statusDropdown);
        if(string.equalsIgnoreCase("ACTIVE")){
            statusSelection.selectByValue("ACTIVE");
        }else if(string.equalsIgnoreCase("INACTIVE")){
            statusSelection.selectByValue("INACTIVE");
        }else{
            Assert.fail("Input must be ACTIVE or INACTIVE");
        }
    }

    @And("Librarian enters {string} from Start Date box")
    public void librarian_enters_from_start_date_box(String string) {
        usersPage.inputStartDate.sendKeys(string);
    }

    @And("Librarian enters {string} from End Date box")
    public void librarian_enters_from_end_date_box(String string) {
        usersPage.inputEndDate.sendKeys(string);
    }

    @And("Librarian enters {string} for Adress box")
    public void librarian_enters_for_adress_box(String string) {
        usersPage.inputAdress.sendKeys(string);
    }


}
